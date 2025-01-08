package ATM;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import java.io.File;

public class ATMScreen  {



    public Label Loginnotfound(){
        Label fail = new Label("Login does not exist");
        fail.getStyleClass().add("label-Fail-login");
        return fail;
    }
    public Label noPinEntered(){
        Label fail = new Label("no Pin entered or incomplete pin ");
        fail.getStyleClass().add("label-noPin-login");
        return fail;
    }

    // these are the buttons on the side of the atm screen for make option in menue


    //TextField textFiled1 = new TextField();
    PasswordField passwordField1 = new PasswordField();
    public Node textBoxForPin(){
        Label label1  = new Label("Pin : ");


        HBox hb = new HBox();
        passwordField1.setPrefWidth(400);
        passwordField1.setPrefHeight(50);
        hb.getChildren().addAll(label1 , passwordField1);
        //hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER);
        // v2 moves the text box up
        hb.setPadding(new Insets(100 , 100 , 400 ,10));
        int max = 4;
        passwordField1.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > max) {
                passwordField1.setText(oldValue); // Revert to the previous value if the new value exceeds 4 characters
            }
        });

        return hb;
    }


    double maxSize = 100;
    // number pad for entering pin and money ammounts
    public GridPane numberPad(){
        Button[] arr = new Button[10];
        for(int i = 0; i < 10; i++){
            Button button = new Button();

            String temp = Integer.toString(i);
            button.setText(temp);
            button.getStyleClass().add("number-pad");
            //creat a event hadler method, this will also use the labels of the buttions that
            // will be converted in to a string and then
            //that will then print it in to the text box.
            button.setOnAction(e ->  {
                    String number = button.getText();
                    passwordField1.appendText(number);


            });
            button.setMaxSize(maxSize, maxSize);
            if(button.getText().equals("0"))arr[arr.length - 1] = button;
            else arr[i - 1] = button;

        }


        // these are the buttons on the right and side delete, clear and enter

        Button enter = new Button("Enter");

        buttonStyle(enter);
        enterButton(enter);

        Button clear = new Button("Clear");

        buttonStyle(clear);
        clearButton(clear);

        Button delete = new Button("Delete");

        buttonStyle(delete);
        deleteButton(delete);

        // the creation of the gridpain

        GridPane gridPane = new GridPane();

        // delete
        //gridPane.setGridLinesVisible(true);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(-300 , 10 , 0 ,0));

        ColumnConstraints colum0 = new ColumnConstraints();
        colum0.setPrefWidth(80);
        RowConstraints row0 = new RowConstraints();
        row0.setPrefHeight(80);

        ColumnConstraints colum1 = new ColumnConstraints();
        colum1.setPrefWidth(80);
        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(80);

        ColumnConstraints colum2 = new ColumnConstraints();
        colum2.setPrefWidth(80);

        RowConstraints row2 = new RowConstraints();
        row2.setPrefHeight(80);

        ColumnConstraints colum3 = new ColumnConstraints();
        colum3.setPrefWidth(40);


        RowConstraints row3 = new RowConstraints();
        row3.setPrefHeight(80);

        ColumnConstraints colum4 = new ColumnConstraints();
        colum4.setPrefWidth(0);

        ColumnConstraints colum5 = new ColumnConstraints();
        colum5.setPrefWidth(150);


        gridPane.getColumnConstraints().add(colum0);
        gridPane.getRowConstraints().add(row0);

        gridPane.getColumnConstraints().add(colum1);
        gridPane.getRowConstraints().add(row1);

        gridPane.getColumnConstraints().add(colum2);
        gridPane.getRowConstraints().add(row2);

        gridPane.getColumnConstraints().add(colum3);
        gridPane.getRowConstraints().add(row3);

        gridPane.getColumnConstraints().add(colum4);

        gridPane.getColumnConstraints().add(colum5);



        int row = 0;
        int col = 0;

        for(int x = 0; x < arr.length ; x++){
            row = x / 3;
            col = x % 3;
            if(x == 9 ){
                gridPane.add(arr[x], 1, 3 , 1 ,  1);
            }else{
                gridPane.add(arr[x], col , row , 1 ,1);
            }

        }

        gridPane.add(clear, 5, 0 , 4 ,  1);

        gridPane.add(enter, 5, 2 , 4 ,  1);

        gridPane.add(delete, 5, 1 , 4 ,  1);


        return gridPane;

    }
    // Layout for the ATM screen
    VBox layout = new VBox();
    // this makes it so i can pass the same stage to the next secen so there isn't
    // a new window opened, this passes it to the setupMain menu
    private Stage primaryStage;
    // this is the setup of the screen
    public void setup(Stage stage) {
        try{
            String cssFilePath = "C:/Users/bendo/IdeaProjects/Java-ATM-/src/main/java/ATM/style/styles.css";
            File cssFile = new File(cssFilePath);
            primaryStage = stage;
            stage.setTitle("ATM Screen");
            layout.getStylesheets().add(cssFile.toURI().toString());



            // Add number pad button to the layout
            layout.getChildren().add(textBoxForPin());
            layout.getChildren().add(numberPad());


            // Create the scene and set it on the stage
            Scene scene = new Scene(layout, 800, 600);
            stage.setScene(scene);
            stage.show();

        }catch(Exception e){

        }

    }


    public void deleteButton(Button button){

        button.setOnAction(e ->  {

            if(passwordField1.getLength() > 0 ){
                passwordField1.setText(passwordField1.getText().substring(0, passwordField1.getText().length() - 1));
            }

        });
    }

    public void clearButton(Button button){

        button.setOnAction(e -> {

            passwordField1.setText(passwordField1.getText().substring(0, passwordField1.getText().length() - passwordField1.getText().length()));
        });
    }

    public void enterButton(Button button ){
        ATMMenuScreen menu = new ATMMenuScreen();
        Label messageOne = Loginnotfound();
        Label messageTwo = noPinEntered();

        button.setOnAction(e -> {
            layout.getChildren().remove(messageTwo);
            layout.getChildren().remove(messageOne);


            if ( passwordField1.getLength() != 0 && passwordField1.getLength() == 4){
                LogIn login = new LogIn();
                boolean found = login.pinChecker(passwordField1);

                if(found){
                    layout.visibleProperty().set(false);
                    // this is where the primaryStage = stage, which means the origanle stage from setup is being passed to menuset up
                    menu.setupMenu(primaryStage);
                }else{
                    //layout.visibleProperty().set(true);
                    layout.getChildren().add(0, messageOne);
                    // this reason these have been added here to is due to the buttons no longer working after the incorrect password
                }
            }else{
                // this reason these have been added here to is due to the buttons no longer working after the incorrect password
                layout.getChildren().add(0, messageTwo);
            }





        });


    }
    private void buttonStyle(Button button){
        button.getStyleClass().add("number-pad");
        button.setMaxSize(150 , 60);
    }


}
