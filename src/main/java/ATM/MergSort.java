package ATM;

import java.util.ArrayList;

public class MergSort {


    public ArrayList<String> sort(ArrayList<String> unsortedArry){

        int[] arr = new int[unsortedArry.size()];
        arr = forStringToIntaar(unsortedArry);
        int[] arrSorted = sort(arr, 0, arr.length - 1);
        ArrayList<String> sortedArry = fromIntegerToString(arrSorted);
        return sortedArry;
    }


    private int[] forStringToIntaar(ArrayList<String> unsortedArry){

        int[] arr = new int[unsortedArry.size()];
        System.out.println("unsored start");
        for(int i = 0 ; i < arr.length; i++){
            String temp = unsortedArry.get(i);
            int tempNum = Integer.parseInt(temp);

            arr[i] = tempNum;

            System.out.println(arr[i]);
        }
        System.out.println("unsored end");

        return arr;

    }
    private ArrayList<String> fromIntegerToString(int[] sortedArr){
        ArrayList<String> sortedArray = new ArrayList<String>();
        System.out.println("sorted start");
        for(int i = 0 ; i < sortedArr.length; i++){
            int tempNum = sortedArr[i];
            String temp  = Integer.toString(tempNum);
            // this addes the ledding 0 back to the numbers in the pins.
            if(temp.length() < 4){
                temp = "0" + temp;
                sortedArray.add(temp);
            }else{
                sortedArray.add(temp);
            }




            System.out.println(sortedArray.get(i));
        }
        System.out.println("sorted end");

        return sortedArray;

    }

    private int[] merge(int[] arr , int l , int m , int r){

        // this is getting the arrays size
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] right = new int[n2];
        int[] left = new int[n1];

        for(int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }
        for(int x = 0; x < n1; x++){
            left[x] = arr[l + x];
        }


        // now the right and left array are gone be conected back to gether
        // i is the left index , j is  the right index
        int i = 0  , j = 0;
        // k is the index of the array the left and right get merged in to
        int k = l;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;

        }
        // the remaing unsorted eliments
        while(i < n1){
            arr[k] = left[i];

            k++;
            i++;
        }
        while(j < n2){
            arr[k] = right[j];
            k++;
            j++;
        }

        return arr;
    }

    //int l = left size , int r = right size of the arrays
    private int[] sort(int[] arr, int l , int r){
        int[] sortedarr = new int[arr.length];
        if(l < r){
            // this is the mid piont of the two arrays
            int mid = l + (r - l) / 2;

            // this allows you to sort each half of the array
            sort(arr, l , mid);
            sort(arr, mid + 1, r);

            merge(arr , l , mid , r);
        }



        return arr;

    }
}
