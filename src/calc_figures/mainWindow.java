package calc_figures;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class mainWindow extends Application {

        @Override
    public void start(Stage mainStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        mainStage.setTitle("Kalkulator figur płaskich");
        mainStage.setScene(new Scene(root, 600, 400));
        mainStage.setResizable(false);
        mainStage.show();

        //Window center on screen
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        mainStage.setX((primScreenBounds.getWidth() - mainStage.getWidth()) / 2);
        mainStage.setY((primScreenBounds.getHeight() - mainStage.getHeight()) / 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
