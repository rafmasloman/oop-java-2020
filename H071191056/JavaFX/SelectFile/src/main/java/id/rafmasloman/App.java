package id.rafmasloman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane allField = new AnchorPane();
        VBox box = new VBox();
        Button selectFile = new Button("Select File");
        TextArea text = new TextArea();
        text.setPrefColumnCount(30);
        text.setPrefRowCount(30);
        text.setId("text");
        box.getChildren().addAll(selectFile, text);
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);

        FileChooser chooseFile = new FileChooser();
        chooseFile.getExtensionFilters().add(new ExtensionFilter("Text", "*txt"));

        selectFile.setOnAction(e -> {

            File file = chooseFile.showOpenDialog(stage);

            if (file != null) {
                File file2 = new File(file.getAbsolutePath());
                chooseFile.setInitialDirectory(file2);
                try {
                    FileReader fileRead = new FileReader(chooseFile.getInitialDirectory());
                    BufferedReader bufferRead = new BufferedReader(fileRead);
                    String test = bufferRead.readLine();
                    while(test != null){
                        text.setText(test);
                        test = bufferRead.readLine();
                    }
                    bufferRead.close();
                    
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            
        });

        Circle circleBtn[] = {new Circle(), new Circle()};
        for (int i = 0; i < circleBtn.length; i++) {
            circleBtn[i].setRadius(4.0);
        }

        Button exit = new Button();
        exit.setShape(circleBtn[0]);
        exit.setId("exitBtn");
        Button minimize = new Button();
        minimize.setShape(circleBtn[1]);
        minimize.setId("minimizeBtn");

        HBox upperButton = new HBox();
        upperButton.setAlignment(Pos.TOP_LEFT);
        upperButton.setPadding(new Insets(10, 0, 0, 10));
        upperButton.getChildren().addAll(minimize,exit);
        upperButton.setSpacing(10);

        AnchorPane.setTopAnchor(box, 10.0);
        AnchorPane.setRightAnchor(box, 10.0);
        AnchorPane.setBottomAnchor(box, 10.0);
        AnchorPane.setLeftAnchor(box, 10.0);

        exit.setOnAction(e->{
            System.exit(0);
        });

        minimize.setOnAction(f->{
            ((Stage) ((Button) f.getSource()).getScene().getWindow()).setIconified(true); 
        });

        allField.setId("allField");
        allField.getChildren().addAll(box,upperButton);
        Scene scene = new Scene(allField,500,600);
        scene.getStylesheets().add(getClass().getResource("Layout.css").toExternalForm());
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}