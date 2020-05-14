package id.rafmasloman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        AnchorPane pane = new AnchorPane();
        
        Image iconImage = new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\icon.png"));
        Menu layout = new Menu(stage);
        layout.setLayout(pane);

        Scene scene = new Scene(layout.getAnchor(),850,450);
        scene.getStylesheets().add(getClass().getResource("RestoranLayout.css").toExternalForm());
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.getIcons().add(iconImage);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}