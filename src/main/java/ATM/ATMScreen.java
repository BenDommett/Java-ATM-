package ATM;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class ATMScreen  {



    // these are the buttons on the side of the atm screen for make option in menue


    TextField textFiled1 = new TextField();
    public Node textBoxForPin(){
        Label label1  = new Label("Pin : ");


        HBox hb = new HBox();
        textFiled1.setPrefWidth(400);
        textFiled1.setPrefHeight(50);
        hb.getChildren().addAll(label1 , textFiled1);
        //hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER);
        // v2 moves the text box up
        hb.setPadding(new Insets(100 , 100 , 400 ,10));
        return hb;
    }


    double maxSize = 100;
    // number pad for entering pin and money ammounts
    public GridPane numberPad(){
        Button button0 = new Button();
        button0.setText("0");
        button0.setMaxSize(maxSize, maxSize);
        button0.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button0);

        Button button1 = new Button();
        button1.setText("1");
        button1.setMaxSize(maxSize, maxSize);
        button1.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button1);

        Button button2 = new Button();
        button2.setText("2");
        button2.setMaxSize(maxSize, maxSize);
        button2.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button2);

        Button button3 = new Button();
        button3.setText("3");
        button3.setMaxSize(maxSize , maxSize);
        button3.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button3);

        Button button4 = new Button();
        button4.setText("4");
        button4.setMaxSize(maxSize , maxSize);
        button4.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button4);

        Button button5 = new Button();
        button5.setText("5");
        button5.setMaxSize(maxSize , maxSize);
        button5.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button5);

        Button button6 = new Button();
        button6.setText("6");
        button6.setMaxSize(maxSize , maxSize);
        button6.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button6);

        Button button7 = new Button();
        button7.setText("7");
        button7.setMaxSize(maxSize , maxSize);
        button7.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button7);

        Button button8 = new Button();
        button8.setText("8");
        button8.setMaxSize(maxSize , maxSize);
        button8.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button8);

        Button button9 = new Button();
        button9.setText("9");
        button9.setMaxSize(maxSize , maxSize);
        button9.setFont(Font.font("Arial", FontWeight.BOLD , 20 ));
        buttonAction(button9);

        // these are the buttons on the right and side delete, clear and enter

        Button enter = new Button();
        enter.setText("Enter");
        enter.setMaxSize(150, 60);
        enter.setFont(new Font("Arial" , 20));
        enterButton(enter);

        Button clear = new Button();
        clear.setText("Clear");
        clear.setMaxSize(150 , 60);
        clear.setFont(new Font("Arial" , 20));
        clearButton(clear);

        Button delete = new Button();
        delete.setText("Delete");
        delete.setMaxSize(150,60);
        delete.setFont(new Font("Arial" , 20));
        deleteButton(delete);

        // the creation of the gridpain

        GridPane gridPane = new GridPane();

        // delete
        //gridPane.setGridLinesVisible(true);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(200 , 10 , 10 ,10));

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

        gridPane.add(button1, 0, 0, 1, 1);

        gridPane.add(button2, 1, 0, 1, 1);

        gridPane.add(button3, 2, 0, 1, 1);

        gridPane.add(button4, 0, 1, 1, 1);

        gridPane.add(button5, 1, 1, 1, 1);

        gridPane.add(button6, 2, 1, 1, 1);

        gridPane.add(button7, 0 , 2 , 1 ,  1);

        gridPane.add(button8, 1 , 2 , 1 ,  1);

        gridPane.add(button9, 2 , 2 , 1 ,  1);

        gridPane.add(button0, 1, 3 , 1 ,  1);



        gridPane.add(clear, 5, 0 , 4 ,  1);

        gridPane.add(enter, 5, 2 , 4 ,  1);

        gridPane.add(delete, 5, 1 , 4 ,  1);


        return gridPane;

    }
    // Layout for the ATM screen
    StackPane layout = new StackPane();
    // this makes it so i can pass the same stage to the next secen so there isn't a new window opened, this passes it to the setupMain menu
    private Stage primaryStage;
    // this is the setup of the screen
    public void setup(Stage stage) {
        primaryStage = stage;
        stage.setTitle("ATM Screen");




        // Add number pad button to the layout
        layout.getChildren().add(textBoxForPin());
        layout.getChildren().add(numberPad());


        // Create the scene and set it on the stage
        Scene scene = new Scene(layout, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    StackPane layoutMenu = new StackPane();
    public void setupMenu(Stage stage) {


        stage.setTitle("ATM Screen");

        ATMMenuScreen menu =  new ATMMenuScreen();


        // Add number pad button to the layout
        layoutMenu.getChildren().add(menu. mainMenu());



        // Create the scene and set it on the stage
        Scene sceneManu = new Scene(layoutMenu, 800, 600);
        stage.setScene(sceneManu);
        stage.close();
        stage.show();
    }

    //creat a event hadler method, this will also use the labels of the buttions that will be converted in to a string and then
    //that will then print it in to the text box.

    public void buttonAction(Button button){

            button.setOnAction(e ->{
                String number = button.getText();
                textFiled1.appendText(number);
            });

    }

    public void deleteButton(Button button){

        button.setOnAction(e ->{
            textFiled1.setText(textFiled1.getText().substring(0, textFiled1.getText().length() - 1));
        });

    }

    public void clearButton(Button button){

        button.setOnAction(e ->{
            textFiled1.setText(textFiled1.getText().substring(0, textFiled1.getText().length() - textFiled1.getText().length()));
        });

    }

    public void enterButton(Button button ){
        ATMMenuScreen menu =  new ATMMenuScreen();

        button.setOnAction(e -> {
            layout.visibleProperty().set(false);

            // this is where the primaryStage = stage, which means the origanle stage from setup is being passed to menuset up
            setupMenu(primaryStage);


        });


    }


}
