package ATM;
//ATM;
import javafx.application.Application;
import javafx.stage.Stage;

public class Mian extends Application {


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ATMScreen atm = new ATMScreen();
        atm.setup(stage);

    }
}
