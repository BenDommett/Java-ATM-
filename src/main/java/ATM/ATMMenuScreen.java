package ATM;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ATMMenuScreen {


    public Label mainMenu(){
        Label label1  = new Label("new page ");

        return label1;
    }
    double maxSize = 100;
    public GridPane  leftTriangleButton() {
        //TriangleButton leftbutton = new TriangleButton();


            // Create the button
            Button buttonTopLeft = new Button();

            // Set the graphic for the button , this is the button on the
            buttonTopLeft.setGraphic(rightArrowButton());

            buttonTopLeft.setStyle("-fx-background-color: transparent;  -fx-border-color: transparent;");

            // Add a style class for custom styling

            Label chassOutPage = new Label("  Cash Out");
            chassOutPage.setGraphic(LabelArrowLeft());
            chassOutPage.setFont(new Font("Arial", 20));



            // button on the top left
            // Create the button
            Button buttonTopRight = new Button();

            // Set the graphic for the button , this is the button on the
            buttonTopRight.setGraphic(leftArrowButton());

            buttonTopRight.setStyle("-fx-background-color: transparent;  -fx-border-color: transparent;");

            // Add a style class for custom styling - this will be need for a hilight on the button

            Label Balance = new Label("Balance");
            Balance.setGraphic(LabelArrowright());
            Balance.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
            Balance.setPadding(new Insets(0, 0, 0, 180));
            Balance.setFont(new Font("Arial", 20));




            Button accountInfromationButton = new Button();
            accountInfromationButton.setGraphic(rightArrowButton());

            accountInfromationButton.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");



            Label Account_Information = new Label("  Account Information");
            Account_Information.setGraphic(LabelArrowLeft());
            Account_Information.setFont(new Font("Arial", 20));

            // deposit
            Button Deposit = new Button();

            Deposit.setGraphic(leftArrowButton());
            Deposit.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");



            Label depositlabel = new Label(" Deposit");
            depositlabel.setGraphic(LabelArrowright());
            depositlabel.setContentDisplay(javafx.scene.control.ContentDisplay.RIGHT);
            depositlabel.setPadding(new Insets(0, 0, 0, 180));
            depositlabel.setFont(new Font("Arial", 20));





            // send the button and to the mainMenu
            return mainMenu(buttonTopLeft , chassOutPage  , buttonTopRight, Balance, accountInfromationButton ,
                    Account_Information , Deposit , depositlabel);


    }

    StackPane layoutMenu = new StackPane();
    public void setupMenu(Stage stage) {


        stage.setTitle("ATM Screen");
        //TriangleButton leftbutton = new TriangleButton();


            // Add number pad button to the layout
            layoutMenu.getChildren().add( leftTriangleButton());



            // Create the scene and set it on the stage

            Scene sceneManu = new Scene(layoutMenu,  800, 600);


            stage.setScene(sceneManu);

            stage.show();
    }

    public GridPane mainMenu(Button bOne, Label ChassoutPage , Button btwo, Label Balance, Button bThree, Label Account_informationL , Button bfour, Label deposit ){
        // the creation of the gridpain

        GridPane gridPane = new GridPane();

        // delete
        gridPane.setGridLinesVisible(true);

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
        row2.setPrefHeight(100);

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



        return gridPane;
    }



    public void enterButton(Button button ){
        ATMMenuScreen menu = new ATMMenuScreen();

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
}
