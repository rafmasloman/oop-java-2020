package id.rafmasloman;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Biodata {
    
    private Scene scene;
    private String name, nim;
    private Button back;

    public Biodata(String name, String nim){
        this.name = name;
        this.nim = nim;
    }
    
    /**
     * @param back the back to set
     */
    public void setBack(Button back) {
        this.back = back;
    }

    /**
     * @return the back
     */
    public Button getBack() {
        return back;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }


    public void showData(Stage stage, ToggleGroup cekGroup, ToggleGroup cekGender, RadioButton getGroup[], RadioButton getGender[], Button exitTotal){
        Label dataLabel[] = {new Label("Nama"), 
        new Label(": "+name), 
        new Label("Nim"),
        new Label(": "+nim)};

        BorderPane dBorder = new BorderPane();
        GridPane dataGrid = new GridPane();
        dataGrid.add(dataLabel[0], 0, 0);
        dataGrid.add(dataLabel[1], 1, 0);
        dataGrid.add(dataLabel[2], 0, 1);
        dataGrid.add(dataLabel[3], 1, 1);

        String gender = "";
        String group = "";

            if(cekGender.getSelectedToggle() != null){
                if(cekGender.getSelectedToggle() == getGender[0]){
                    gender = getGender[0].getText();   
                }
                else if(cekGender.getSelectedToggle() == getGender[1]){
                    gender = getGender[1].getText();
                }
            }

            else{
                Alert wrong = new Alert(AlertType.CONFIRMATION);
                wrong.setContentText("Jenis Kelamin Tidak diisi");
                wrong.show();
            }

           
            for (int i = 0; i < getGroup.length; i++) {
                if(cekGroup.getSelectedToggle() != null){
                    if(cekGroup.getSelectedToggle() == getGroup[i]){
                        group = getGroup[i].getText();
                    }
                }
                else{
                    Alert wrong = new Alert(AlertType.WARNING);
                    wrong.setContentText("Kelompok Tidak Diisi");
                    wrong.show();
                    break;
                }
            }
        

        Label jenisKel = new Label(": "+gender);
        Label kelompok = new Label(": "+group);


        Button back = new Button("Back");
        setBack(back);
        dataGrid.add(new Label("Jenis Kelamin"), 0, 2);
        dataGrid.add(jenisKel, 1, 2);
        dataGrid.add(new Label("Kelompok"), 0, 3);
        dataGrid.add(kelompok, 1, 3);
        dataGrid.add(back, 1, 5);
        dataGrid.setHgap(20);
        dataGrid.setVgap(30);
        dataGrid.setAlignment(Pos.CENTER);
        dBorder.setCenter(dataGrid);

        HBox exitButton = new HBox();
        exitButton.getChildren().add(exitTotal);
        exitButton.setAlignment(Pos.TOP_RIGHT);
        dBorder.setTop(exitButton);

        scene = new Scene(dBorder, 600, 300);
        stage.setScene(scene);
        stage.show();
           
    }

    public void isBack(Stage stage,Scene mainScene,BorderPane side){
        back.setOnAction(e -> {
        Button exitTotal = new Button("x");
        exitTotal.setId("Exit");
        HBox exitButton = new HBox();
        exitButton.getChildren().add(exitTotal);
        exitButton.setAlignment(Pos.TOP_RIGHT);
        side.setTop(exitButton);
        exitTotal.setOnAction(f-> System.exit(0));
        stage.setScene(mainScene);
        });
    }

}