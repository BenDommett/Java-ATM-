package ATM;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class ATMMenuScreen {



    // Add a style class for custom styling - this will be need for a hilight on the button
    //this method name had changed from TriangleButton() to MainMenuButtons()
    public GridPane  MainMenuButtons() {


            // Start of buttonchassOutPage
            Button buttonchassOutPage = new Button();
            // Set the graphic for the button , this is the button on the
            buttonchassOutPage.setGraphic(rightArrowButton());
            //button style method
            buttonStyle(buttonchassOutPage);
            // Start of label
            Label chassOutPage = new Label("  Cash Out");
            chassOutPage.setGraphic(LabelArrowLeft());
            labelStyleWithNonePadding(chassOutPage);
            // end of chassOutPage


            //Start of Balancebutton
            Button Balancebutton = new Button();
            // Set the graphic for the button
            Balancebutton.setGraphic(leftArrowButton());
            // button style method
            buttonStyle(Balancebutton);

            // Start of label
            Label Balance = new Label("Balance");
            Balance.setGraphic(LabelArrowright());
            // style method for the label
            labelStyle(Balance);
            // end of Balance


            // Start account information
            Button accountInfromationButton = new Button();
            accountInfromationButton.setGraphic(rightArrowButton());
            buttonStyle(accountInfromationButton);
            //Start of label
            Label Account_Information = new Label("  Account Information");
            Account_Information.setGraphic(LabelArrowLeft());
            labelStyleWithNonePadding(Account_Information);
            // end of account information

            // Start deposit
            Button Deposit = new Button();
            Deposit.setGraphic(leftArrowButton());
            //button method for the style
            buttonStyle(Deposit);

            //Start of label for the deposit
            Label depositlabel = new Label(" Deposit");
            depositlabel.setGraphic(LabelArrowright());
            // style for the deposit label
            labelStyle(depositlabel);
            // end of the deposit

            //Start fastCash £100/ if the is less then a £100 in the count this button mybe deactivated
            Button FastCashButton = new Button();
            FastCashButton.setGraphic(rightArrowButton());
            buttonStyle(FastCashButton);
            // Start FastCash label
            // we may make the verable to the amount in the account untill less than £5 in the account but the account cant be emptyed by the amount so £10 in the account it as low as it can be
            Label FasCashLabel = new Label("  FastCash");
            FasCashLabel.setGraphic(LabelArrowLeft());
            labelStyleWithNonePadding(FasCashLabel);
            //end of fastCash

            // Start of More Services
            Button moreSericesButton = new Button();
            moreSericesButton.setGraphic(leftArrowButton());
            buttonStyle(moreSericesButton);
            //start of more service label.
            Label MoreServiceLabel = new Label("More Service");
            MoreServiceLabel.setGraphic(LabelArrowright());

            labelStyleWithNonePadding(MoreServiceLabel);

            // Start change pin
            Button ChangePinButton = new Button();
            ChangePinButton.setGraphic(rightArrowButton());
            buttonStyle(ChangePinButton);
            //Start of the Change pin label
            Label ChangePinLabel = new Label("  change pin");
            ChangePinLabel.setGraphic(LabelArrowLeft());
            labelStyleWithNonePadding(ChangePinLabel);
            //end of change pin

            // start bill payment
            Button billPaymentButton = new Button();
            billPaymentButton.setGraphic(leftArrowButton());
            buttonStyle(billPaymentButton);
            //Start of bill payment label
            Label billpaymentLabel = new Label("Bill Payment");
            billpaymentLabel.setGraphic(LabelArrowright());
            labelStyleWithNonePadding(billpaymentLabel);



            // send the button and to the mainMenu
            return mainMenu(buttonchassOutPage , chassOutPage  , Balancebutton, Balance, accountInfromationButton ,
                    Account_Information , Deposit , depositlabel , FastCashButton , FasCashLabel,
                    moreSericesButton,MoreServiceLabel ,ChangePinButton , ChangePinLabel ,
                    billPaymentButton , billpaymentLabel);


    }

    StackPane layoutMenu = new StackPane();
    public void setupMenu(Stage stage) {
        try {

            stage.setTitle("ATM Screen");
            //TriangleButton leftbutton = new TriangleButton();


            // Add number pad button to the layout
            layoutMenu.getChildren().add( MainMenuButtons());
            layoutMenu.getChildren().add(logOutButton());

            // Create the scene and set it on the stage

            Scene sceneManu = new Scene(layoutMenu,  800, 600);
            String cssFilePath = "C:/Users/bendo/IdeaProjects/Java-ATM-/src/main/java/ATM/style/styles.css";
            File cssFile = new File(cssFilePath);


            sceneManu.getStylesheets().add(cssFile.toURI().toString());


            stage.setScene(sceneManu);

            stage.show();

        }catch (Exception e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }

    }

    public Button logOutButton(){
        // Start logOut
        Button logOutButton = new Button("Logout");
        logOutButton.setGraphic(LabelArrowLeft());
        logOutButton.setTranslateX(320);
        logOutButton.setTranslateY(220);
        // end of logOut button
        return logOutButton;
    }

    public GridPane mainMenu(Button bOne, Label ChassoutPage , Button btwo, Label Balance, Button bThree, Label Account_informationL , Button bfour, Label deposit
    , Button bfive , Label FastCash , Button bsix , Label MoreSErvies , Button bsevin ,
                             Label changePinLabel , Button bEight , Label billpaymentLabel){
        // the creation of the gridpain

        GridPane gridPane = new GridPane();


        gridPane.setAlignment(Pos.CENTER);

        // top ,  right, left , bottom
        gridPane.setPadding(new Insets(10 , 10 , 10 ,10));


        ColumnConstraints colum0 = new ColumnConstraints();
        colum0.setPrefWidth(80);
        RowConstraints row0 = new RowConstraints();
        row0.setPrefHeight(80);

        ColumnConstraints colum1 = new ColumnConstraints();
        colum1.setPrefWidth(300);
        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(80);

        ColumnConstraints colum2 = new ColumnConstraints();
        colum2.setPrefWidth(50);

        RowConstraints row2 = new RowConstraints();
        row2.setPrefHeight(80);

        ColumnConstraints colum3 = new ColumnConstraints();
        colum3.setPrefWidth(300);
        RowConstraints row3 = new RowConstraints();
        row3.setPrefHeight(80);

        ColumnConstraints colum4 = new ColumnConstraints();
        colum4.setPrefWidth(80);


        RowConstraints row4 = new RowConstraints();
        row4 .setPrefHeight(80);




        gridPane.getColumnConstraints().add(colum0);
        gridPane.getRowConstraints().add(row0);

        gridPane.getColumnConstraints().add(colum1);
        gridPane.getRowConstraints().add(row1);

        gridPane.getColumnConstraints().add(colum2);
        gridPane.getRowConstraints().add(row2);

        gridPane.getColumnConstraints().add(colum3);
        gridPane.getRowConstraints().add(row3);

        gridPane.getColumnConstraints().add(colum4);
        gridPane.getRowConstraints().add(row4);






                          //  colum , row,
        gridPane.add(bOne, 0, 0, 1, 1);

        gridPane.add(ChassoutPage, 1, 0, 1, 1);

        gridPane.add( Balance, 3 , 0 , 1 ,1  );

        gridPane.add(btwo , 4 , 0 , 1 ,1 );

        gridPane.add(bThree , 0 , 1 , 1, 1);

        gridPane.add(Account_informationL , 1 ,1 ,1,1);

        gridPane.add(deposit , 3 ,1 ,1 , 1);

        gridPane.add(bfour , 4 , 1 ,1,1 );

        gridPane.add(bfive, 0 , 2 ,1 ,1  );

        gridPane.add(FastCash, 1 , 2 ,1 ,1 );

        gridPane.add(MoreSErvies , 3 ,2 ,1 ,1 );

        gridPane.add(bsix , 4 , 2 , 1 ,1 );

        gridPane.add(bsevin , 0 , 3 ,1 ,1 );

        gridPane.add(changePinLabel , 1 ,3 ,1,1);

        gridPane.add(bEight , 4 , 3 , 1 ,1 );

        gridPane.add(billpaymentLabel, 3 ,3 ,1, 1);






        return gridPane;
    }



    public void enterButton(Button button ){


        button.setOnAction(e -> {
            // this is where the primaryStage = stage, which means the origanle stage from setup is being passed to menuset up

        });





    }
    // this is come about due to the amount of times this code has had to be repeated
    public ImageView rightArrowButton(){
        try {
            // this is for the left hand side button
            FileInputStream right = new FileInputStream("C:\\Users\\bendo\\IdeaProjects\\Java-ATM-\\src\\main\\java\\ATM\\style\\right-arrow_4238475.png");
            Image imageRightButton = new Image(right, 50, 50, false, false);


            return new ImageView(imageRightButton);
        }catch (FileNotFoundException e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }

        return null;
    }
    public  ImageView leftArrowButton(){
        try {


            FileInputStream left = new FileInputStream("C:\\Users\\bendo\\IdeaProjects\\Java-ATM-\\src\\main\\java\\ATM\\style\\left-arrow_4238475.png");
            Image imageLeftButton = new Image(left, 50, 50, false, false);

           return new ImageView(imageLeftButton);
        }catch (FileNotFoundException e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }

        return null;
    }

    public ImageView LabelArrowLeft(){
        try{
            FileInputStream leftarrow = new FileInputStream("C:\\Users\\bendo\\IdeaProjects\\Java-ATM-\\src\\main\\java\\ATM\\style\\pointingLeft.png");
            Image imageViewArrow = new Image(leftarrow, 30, 30, false, false);

            return  new ImageView(imageViewArrow);
        }catch (FileNotFoundException e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }

        return null;

    }

    public ImageView LabelArrowright(){
        try{
            FileInputStream rightarrow = new FileInputStream("C:\\Users\\bendo\\IdeaProjects\\Java-ATM-\\src\\main\\java\\ATM\\style\\pointingRight.png");
            Image imageViewArrow = new Image(rightarrow, 30, 30, false, false);

            return  new ImageView(imageViewArrow);
        }catch (FileNotFoundException e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }

        return null;

    }

    public void labelStyleWithNonePadding(Label label){

        label.getStyleClass().add("label");
        if(label.getText().equals("More Service") || label.getText().equals("Bill Payment")){
            label.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
            label.getStyleClass().add("More-Services-padding");
        }



    }

    public void labelStyle(Label label){
        label.getStyleClass().add("label-right-padding");
        label.getStyleClass().add("label");
        label.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);


    }

    public void buttonStyle(Button button){
        button.getStyleClass().add("transparent-button");
        button.getStyleClass().add("button-arrows");


    }



}
