package ATM;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;


public class ATMMenuScreen {


    public Label mainMenu(){
        Label label1  = new Label("new page ");

        return label1;
    }
    double maxSize = 100;
    public Button leftTriangleButton() {
        //TriangleButton leftbutton = new TriangleButton();
        try {

            FileInputStream left = new FileInputStream("C:\\Users\\bendo\\IdeaProjects\\Java-ATM-\\src\\main\\java\\ATM\\style\\left-arrow_4238475.png");
            Image imageView = new Image(left, 50, 50, false, false);
            ImageView imageViewNode = new ImageView(imageView);

            // Create the button
            Button buttonTopLeft = new Button();

            // Set the graphic for the button
            buttonTopLeft.setGraphic(imageViewNode);

            buttonTopLeft.setStyle("-fx-background-color: transparent;  -fx-border-color: transparent;");

            // Add a style class for custom styling
            buttonTopLeft.getStyleClass().add("image-only-button");

            enterButton(buttonTopLeft);

            return buttonTopLeft;
        }catch (FileNotFoundException e) {
            // Handle the exception (e.g., log the error or use a placeholder image)
            System.err.println("Image file not found: " + e.getMessage());
            // Optionally, set a default graphic or leave it without one
        }


        return null;

    }

    StackPane layoutMenu = new StackPane();
    public void setupMenu(Stage stage) {


        stage.setTitle("ATM Screen");
        //TriangleButton leftbutton = new TriangleButton();


            // Add number pad button to the layout
            layoutMenu.getChildren().add( leftTriangleButton());



            // Create the scene and set it on the stage

            Scene sceneManu = new Scene(layoutMenu, 800, 600);


            stage.setScene(sceneManu);

            stage.show();






    }

    public void enterButton(Button button ){
        ATMMenuScreen menu = new ATMMenuScreen();

        button.setOnAction(e -> {


            // this is where the primaryStage = stage, which means the origanle stage from setup is being passed to menuset up
            button.setText("press worked");


        });


    }
}
