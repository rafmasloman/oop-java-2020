package id.rafmasloman;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        ToggleGroup group = new ToggleGroup();

        RadioButton programming[] = {new RadioButton("Kelompok 1"),
        new RadioButton("Kelompok 2"),
        new RadioButton("Kelompok 3"),
        new RadioButton("Kelompok 4")};

        programming[0].setToggleGroup(group);
        programming[1].setToggleGroup(group);
        programming[2].setToggleGroup(group);
        programming[3].setToggleGroup(group);
        BorderPane side = new BorderPane();
        GridPane leftGrid = new GridPane();
        Label language = new Label("Kelompok");
        VBox left = new VBox();
        leftGrid.add(programming[0], 0, 0);
        leftGrid.add(programming[2], 0, 1);
        leftGrid.add(programming[1], 1, 0);
        leftGrid.add(programming[3], 1, 1);
        leftGrid.setVgap(10);
        leftGrid.setHgap(50);
        left.setId("boxLeft");
        left.setMaxWidth(Double.MAX_VALUE);
        left.getChildren().addAll(language,leftGrid);
        left.setPadding(new Insets(10, 10, 10, 10));
        left.setSpacing(20);
        left.setAlignment(Pos.CENTER);
        side.setLeft(left);
        
        Label label[] = {new Label("Name"), new Label("NIM"), new Label("Jenis Kelamin")};
        TextField input[] = {new TextField(),new TextField()};
    

        ToggleGroup group2 = new ToggleGroup();
        RadioButton[] gender = {new RadioButton("Laki-laki"),
        new RadioButton("Perempuan")};
        gender[0].setToggleGroup(group2);
        gender[1].setToggleGroup(group2);
        Button save = new Button("Save");
        save.setId("buttonSave");
        input[0].setPromptText("NIM");
        input[0].setId("nim");
        input[1].setPromptText("Nama");
        input[1].setId("nama");

        
        
        GridPane rightGrid = new GridPane();
        rightGrid.add(label[1], 0, 0);
        rightGrid.add(label[0], 0, 1);
        rightGrid.add(label[2], 0, 2);
        rightGrid.add(input[0], 1, 0);
        rightGrid.add(input[1], 1, 1);
        rightGrid.add(gender[0], 1, 2);
        rightGrid.add(gender[1], 1, 3);
        rightGrid.setHgap(50);
        rightGrid.setVgap(10);

        VBox right = new VBox();
        right.getChildren().addAll(new Label("Data"), rightGrid);
        right.setPadding(new Insets(50, 10, 10, 10));
        right.setAlignment(Pos.CENTER);
        right.setSpacing(20);
        right.setId("rightV");
        side.setRight(right);

       

        Button exitTotal = new Button("x");
        exitTotal.setId("Exit");
        
        HBox exitButton = new HBox();
        exitButton.getChildren().add(exitTotal);
        exitButton.setAlignment(Pos.TOP_RIGHT);
        side.setTop(exitButton);
        
        HBox button = new HBox();
        button.getChildren().add(save);
        button.setAlignment(Pos.CENTER_RIGHT);
        button.setPadding(new Insets(0, 10, 10, 0));
        button.setMinSize(0, 10);
        side.setBottom(button);
        
        exitTotal.setOnAction(e -> System.exit(0));
        side.setId("Border");

        
        Scene scene = new Scene(side,700,300);
        scene.getStylesheets().add(getClass().getResource("DataKelompok.css").toExternalForm());
        save.setOnAction(e -> {

            Biodata biodata = new Biodata(input[1].getText(), input[0].getText());

            biodata.showData(stage, group, group2, programming, gender,exitTotal);

            biodata.isBack(stage,scene,side);

        });
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Data Kelompok");
        stage.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}