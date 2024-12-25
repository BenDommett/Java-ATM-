package ATM;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

// this is to create a the triangle shaped of interactive buttons
public class TriangleButton extends Button {

    // Triangle button to the left
    public Node tButtonLeft(){
        Polygon leftTriangle = new Polygon();

        leftTriangle.getPoints().addAll(
                0.0, 15.0,
                30.0, 0.0,
                30.0, 30.0
        );
        leftTriangle.setFill(Color.BLACK);
        return leftTriangle;
    }


}
