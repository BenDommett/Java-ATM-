package ATM;

import javafx.scene.control.PasswordField;

import java.util.ArrayList;

public class search {

    public Boolean search(int[] arr , PasswordField loginInput , int x , int l){


        String temp = loginInput.getText();
        int input = Integer.parseInt(temp);
        int result = finding(arr , input , x , l);

        if(result != -1){
            return true;
        }else{
            return false;
        }


    }

    private int finding(int[] arr ,  int input , int x , int l){

        if(x >= l){
            int mid = l + (x - l ) / 2;

            if(arr[mid] == input){
                return  mid;
            }if(arr[mid] > input ){
                return finding(arr, input , mid - 1, l);
            }else{
                return finding(arr , input ,  x , mid + 1);
            }

        }
        return -1;
    }
}
