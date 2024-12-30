package ATM;

import javafx.scene.control.PasswordField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {


    public void pinChecker(PasswordField pin){

    }

    private  ArrayList<String> pins = new ArrayList<String>();
    private void gettingPins(){
        //String pinINString = pin.getText();
        File fileOfPins = new File("C:/Users/bendo/IdeaProjects/Java-ATM-/src/main/java/ATM/pinTestFile");


        try{
            Scanner scr = new Scanner(fileOfPins);

            while(scr.hasNext()){
                String temp = scr.nextLine();

                pins.add(temp);
            }
            scr.close();
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }
    }
    private void arraySort(){

    }
}
