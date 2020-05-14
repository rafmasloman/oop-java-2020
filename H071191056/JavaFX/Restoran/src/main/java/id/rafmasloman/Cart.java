package id.rafmasloman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Optional;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Cart {

    private int totalPrice;
    private Stage stage;
    private Button exit;

    public Cart(Stage stage, int totalPrice) {
        this.totalPrice = totalPrice;
        this.stage = stage;
    }

    /**
     * @param foodNameL the foodNameL to set
     */

    /**
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param exitBtn the exitBtn to set
     */
    public void setExitBtn(Button exit) {

        this.exit = exit;
    }

    /**
     * @return the exitBtn
     */
    public Button getExitBtn() {
        return exit;
    }

    public void addToCart(TextField[] addFood, int[] food, Button menu[], Image btnImg[]) {

        var objek = new Object() {
            Label totalHarga;
            Label foodName;
            Label jumlahPesanan;
        };

        menu[2].setOnAction(e -> {

            for (int i = 0; i < addFood.length; i++) {
                Alert space = new Alert(AlertType.NONE);
                if (addFood[i].getText().contains(" ")) {
                    space = new Alert(AlertType.ERROR);
                    space.setContentText("Cannot have space");
                    space.show();
                }
            }

            int foodKind[] = { Integer.parseInt(0 + addFood[0].getText()), Integer.parseInt(0 + addFood[1].getText()),
                    Integer.parseInt(0 + addFood[2].getText()), Integer.parseInt(0 + addFood[3].getText()),
                    Integer.parseInt(0 + addFood[4].getText()), Integer.parseInt(0 + addFood[5].getText()) };

            int hargaMakanan[] = { foodKind[0] * food[0], foodKind[1] * food[1], foodKind[2] * food[2],
                    foodKind[3] * food[3], foodKind[4] * food[4], foodKind[5] * food[5] };

            String giveName[] = { "Gurame Bakar", "Noodle", "Nasi Kuning", "Coto", "Nasi Goreng", "Spaghetti" };
            String giveName2 = "";
            for (int i = 0; i < giveName.length; i++) {
                if (foodKind[i] != 0) {
                    giveName2 += String.format("\n-%s", giveName[i]);
                }

            }

            totalPrice = hargaMakanan[0] + hargaMakanan[1] + hargaMakanan[2] + hargaMakanan[3] + hargaMakanan[4]
                    + hargaMakanan[5];
            int jumlah = foodKind[0] + foodKind[1] + foodKind[2] + foodKind[3] + foodKind[4] + foodKind[5];

            objek.foodName = new Label("Nama Makanan : " + giveName2);
            Label labelJumlah = new Label("Jumlah Pesanan");
            objek.jumlahPesanan = new Label(String.format("= %d", jumlah));
            Label labelHarga = new Label("Total Harga");
            objek.totalHarga = new Label(String.format("= Rp.%d", totalPrice));
            objek.totalHarga.setId("labelHarga");

            // Kode untuk Tampilan User Interface

            AnchorPane pane = new AnchorPane();

            BorderPane bord = new BorderPane();

            ImageView btnImgV[] = { new ImageView(btnImg[0]), new ImageView(btnImg[1]), new ImageView(btnImg[2]),
                    new ImageView(btnImg[3]) };

            for (int i = 0; i < btnImgV.length; i++) {
                btnImgV[i].setFitHeight(30);
                btnImgV[i].setFitWidth(35);
            }

            HBox btnBox = new HBox();
            btnBox.setPadding(new Insets(20, 0, 0, 0));
            btnBox.getChildren().addAll(btnImgV[0], menu[0]);
            btnBox.setAlignment(Pos.CENTER);
            btnBox.setSpacing(10);

            HBox btnBox2 = new HBox();
            btnBox2.setPadding(new Insets(20, 20, 0, 0));
            btnBox2.getChildren().addAll(btnImgV[1], menu[1]);
            btnBox2.setAlignment(Pos.CENTER);
            btnBox2.setSpacing(10);

            HBox btnBox3 = new HBox();
            btnBox3.setPadding(new Insets(20, 30, 0, 0));
            btnBox3.getChildren().addAll(btnImgV[2], menu[2]);
            btnBox3.setAlignment(Pos.CENTER);
            btnBox3.setSpacing(10);

            HBox btnBox4 = new HBox();
            btnBox4.setPadding(new Insets(20, 20, 0, 0));
            btnBox4.getChildren().addAll(btnImgV[3], menu[3]);
            btnBox4.setAlignment(Pos.CENTER);
            btnBox4.setSpacing(10);

            var logoObject = new Object(){
                Image logo;
            };
            try {
                logoObject.logo = new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\Logo.png"));
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            ImageView ivLogo = new ImageView(logoObject.logo);
            ivLogo.setFitHeight(100);
            ivLogo.setFitWidth(80);

            StackPane logoPane = new StackPane();
            logoPane.getChildren().add(ivLogo);
            logoPane.setPadding(new Insets(30, 0, 0, 0));

            VBox box = new VBox();
            box.getChildren().addAll(logoPane, btnBox, btnBox2, btnBox3, btnBox4);
            box.setSpacing(10);
            bord.setCenter(box);
            box.setId("box");

            AnchorPane.setTopAnchor(box, 0.0);
            AnchorPane.setBottomAnchor(box, 20.0);
            AnchorPane.setLeftAnchor(box, 0.0);
            AnchorPane.setRightAnchor(box, 700.0);

            Button confirm = new Button("confirm");

            GridPane priceTotalBox = new GridPane();

            priceTotalBox.add(labelJumlah, 0, 0);
            priceTotalBox.add(objek.jumlahPesanan, 1, 0);
            priceTotalBox.add(objek.foodName, 0, 1);
            priceTotalBox.add(labelHarga, 0, 2);
            priceTotalBox.add(objek.totalHarga, 1, 2);
            priceTotalBox.add(confirmButton(confirm), 0, 3);
            priceTotalBox.setVgap(20);
            priceTotalBox.setHgap(20);

            VBox tes = new VBox();
            tes.getChildren().addAll(priceTotalBox);
            tes.setSpacing(30);
            tes.setAlignment(Pos.TOP_CENTER);
            bord.setCenter(tes);

            AnchorPane.setTopAnchor(bord, 100.0);
            AnchorPane.setBottomAnchor(bord, 50.0);
            AnchorPane.setLeftAnchor(bord, 205.0);
            AnchorPane.setRightAnchor(bord, 50.0);

            Circle circle[] = { new Circle(), new Circle() };
            for (int i = 0; i < circle.length; i++) {
                circle[i].setRadius(4.0);
            }
            circle[0].setFill(Color.YELLOW);
            circle[1].setFill(Color.RED);

            // HBOX menu untuk exit
            HBox upperMenu = new HBox();

            Button exit = new Button();
            exit.setShape(circle[1]);
            exit.setId("Exit");

            Button minimize = new Button();
            minimize.setShape(circle[0]);
            minimize.setId("Minimize");

            upperMenu.setPadding(new Insets(10, 10, 0, 0));
            upperMenu.setId("upperMenu");
            upperMenu.getChildren().addAll(minimize, exit);
            upperMenu.setSpacing(10);
            upperMenu.setAlignment(Pos.TOP_RIGHT);
            upperMenu.setPrefHeight(20);
            upperMenu.setPrefWidth(600);

            AnchorPane.setTopAnchor(upperMenu, 0.0);
            AnchorPane.setBottomAnchor(upperMenu, 420.0);
            AnchorPane.setLeftAnchor(upperMenu, 150.2);
            AnchorPane.setRightAnchor(upperMenu, 0.0);

            exit.setOnAction(f -> System.exit(0));

            minimize.setOnAction(f -> {
                ((Stage) ((Button) f.getSource()).getScene().getWindow()).setIconified(true);
            });

            pane.getChildren().addAll(box, bord, upperMenu);
            pane.setId("anchor");

            Scene scene = new Scene(pane, 850, 450);
            scene.getStylesheets().add(getClass().getResource("CartLayout.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

            menu[1].setOnAction(f -> {
                Menu menuPage = new Menu(stage);
                menuPage(menuPage);
            });

        });

    }

    public Button confirmButton(Button confirm) {
        VBox confirmBtn = new VBox();
        confirmBtn.getChildren().addAll(confirm);
        confirmBtn.setAlignment(Pos.BOTTOM_RIGHT);

        confirm.setOnAction(e -> {

            Alert confirmAlert = new Alert(AlertType.CONFIRMATION);
            confirmAlert.setContentText("PEMBAYARAN BERHASIL");
            confirmAlert.setHeaderText("Payment Status");
            confirmAlert.show();

            
        });

        return confirm;
    }

    public void menuPage(Menu menu){
        menu = new Menu(stage);
        AnchorPane pane = new AnchorPane();
        try {
            menu.setLayout(pane);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Scene scene2 = new Scene(menu.getAnchor(), 850, 450);
        scene2.getStylesheets().add(getClass().getResource("RestoranLayout.css").toExternalForm());
        stage.setScene(scene2);
        stage.show();

    }

}