package ATM;

import java.util.ArrayList;

public class MergSort {


    public int[] sort(ArrayList<String> unsortedArry){


        int[] arr = forStringToIntaar(unsortedArry);
        int[] arrSorted = sort(arr, 0, arr.length - 1);


        return arrSorted;
    }


    private int[] forStringToIntaar(ArrayList<String> unsortedArry){

        int[] arr = new int[unsortedArry.size()];

        for(int i = 0 ; i < arr.length; i++){
            String temp = unsortedArry.get(i);
            int tempNum = Integer.parseInt(temp);

            arr[i] = tempNum;


        }


        return arr;

    }
    // this maybe needed later for when the pin chnage page is in use to make sure then new pin is not equal to the old one, will be changed
    // as all the pins are not needed, this was also more for me making sure the array was sored properly.
    private ArrayList<String> fromIntegerToString(int[] sortedArr){
        ArrayList<String> sortedArray = new ArrayList<String>();

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
        }


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
