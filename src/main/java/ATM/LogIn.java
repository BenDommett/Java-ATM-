package ATM;

import javafx.scene.control.PasswordField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {


    public boolean pinChecker(PasswordField pin){
        MergSort merg = new MergSort();
        search ser = new search();
       int[] sortedarr =  merg.sort(gettingPins());

       boolean found =   ser.checking(sortedarr , pin , sortedarr.length - 1, 0);

       return found;
    }


    private ArrayList<String> gettingPins(){



        try{
            ArrayList<String> pins = new ArrayList<String>();
            //String pinINString = pin.getText();
            File fileOfPins = new File("C:/Users/bendo/IdeaProjects/Java-ATM-/src/main/java/ATM/pinTestFile");
            Scanner scr = new Scanner(fileOfPins);

            while(scr.hasNext()){
                String temp = scr.nextLine();

                pins.add(temp);
            }
            scr.close();
            return pins;
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }
        return null;
    }

}
