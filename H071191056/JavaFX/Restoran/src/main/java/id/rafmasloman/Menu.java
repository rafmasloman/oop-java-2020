package id.rafmasloman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Menu {

    private AnchorPane pane;
    private Stage stage;

    /**
     * @param anchor the anchor to set
     */
    
     public Menu(Stage stage){
        this.stage = stage;    
     }

    public void setLayout(AnchorPane pane) throws FileNotFoundException {
        this.pane = pane;
        BorderPane bord = new BorderPane();

        Image btnImg[] = { new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\web.png")),
                new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\knife.png")),
                new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\shopping-store.png")),
                new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\internet.png"))};

        Button menu[] = { new Button("Home"), new Button("Menu"), new Button("Cart"), new Button("Help") };
        for (int i = 0; i < menu.length; i++) {
            menu[i].setId("menu");
        }

        ImageView btnImgV[] = { new ImageView(btnImg[0]), new ImageView(btnImg[1]), new ImageView(btnImg[2]),
                new ImageView(btnImg[3]) };

        for (int i = 0; i < btnImgV.length; i++) {
            btnImgV[i].setFitHeight(30);
            btnImgV[i].setFitWidth(35);
        }

        HBox btnBox = new HBox();
        btnBox.setPadding(new Insets(20, 10, 0, 0));
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

        Image logo = new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\Logo.png"));
        ImageView ivLogo = new ImageView(logo);
        ivLogo.setFitHeight(100);
        ivLogo.setFitWidth(80);

        StackPane logoPane = new StackPane();
        logoPane.getChildren().add(ivLogo);
        logoPane.setPadding(new Insets(30,0,0,0));

        VBox box = new VBox();
        box.getChildren().addAll(logoPane,btnBox, btnBox2, btnBox3, btnBox4);
        box.setSpacing(10);
        bord.setCenter(box);
        box.setId("box");


        // Layout Untuk Menu Makanan
        Image foodImg[] = {
                new Image(new FileInputStream(
                        "src\\main\\java\\id\\rafmasloman\\Image\\Resep-Ikan-bakar-bumbu-bali.jpg")),
                new Image(new FileInputStream("src\\main\\java\\id\\rafmasloman\\Image\\19806.jpg")),
                new Image(new FileInputStream(
                        "src\\main\\java\\id\\rafmasloman\\Image\\nasi-kuning-50217432.jpg")),
                new Image(new FileInputStream(
                        "src\\main\\java\\id\\rafmasloman\\Image\\soto-betawi-50244009.jpg")),
                new Image(new FileInputStream(
                        "src\\main\\java\\id\\rafmasloman\\Image\\173905_covernasigorengbuntut.jpg")),
                new Image(new FileInputStream(
                        "src\\main\\java\\id\\rafmasloman\\Image\\igoxewziea9apal2e6sd.jpg")) };

        ImageView getImg[] = { new ImageView(foodImg[0]), new ImageView(foodImg[1]), new ImageView(foodImg[2]),
                new ImageView(foodImg[3]), new ImageView(foodImg[4]), new ImageView(foodImg[5]) };

        for (int i = 0; i < getImg.length; i++) {
            getImg[i].setFitWidth(150);
            getImg[i].setFitHeight(85);
        }

        TextField addFood[] = { new TextField(), new TextField(), new TextField(), new TextField(), new TextField(),
                new TextField() };

        for (int i = 0; i < addFood.length; i++) {
            addFood[i].setId("addFood");
            addFood[i].setPromptText("Add");
        }

        for (int i = 0; i < addFood.length; i++) {
            addFood[i].setMaxSize(40, 35);
        }

        int foodCost[] = { 25000, 15000, 13000, 15000, 10000, 30000 };

        Label food[] = { new Label("Gurame Bakar\nRp." + foodCost[0]), new Label("Noodle\nRp." + foodCost[1]),
                new Label("Nasi Kuning\nRp." + foodCost[2]), new Label("Coto \"Mungkin\"\nRp." + foodCost[3]),
                new Label("Nasi Goreng Biasa\nRp." + foodCost[4]),
                new Label("Spaghetti\nRp." + foodCost[5]) };

        HBox ikanBox = new HBox();
        ikanBox.getChildren().addAll(getImg[0]);
        ikanBox.setSpacing(10);
        VBox ikanVBox = new VBox();
        ikanVBox.getChildren().addAll(food[0], addFood[0]);
        ikanVBox.setSpacing(5);

        FlowPane left = new FlowPane();
        left.getChildren().addAll(ikanBox, ikanVBox);
        left.setHgap(10);

        HBox noodleBox = new HBox();
        noodleBox.getChildren().addAll(getImg[1]);
        noodleBox.setSpacing(10);
        VBox noodleVBox = new VBox();
        noodleVBox.getChildren().addAll(food[1], addFood[1]);
        noodleVBox.setSpacing(5);

        FlowPane left2 = new FlowPane();
        left2.getChildren().addAll(noodleBox, noodleVBox);
        left2.setHgap(10);

        HBox spaghettiBox = new HBox();
        spaghettiBox.getChildren().addAll(getImg[5]);
        spaghettiBox.setSpacing(10);
        VBox spaghettiVBox = new VBox();
        spaghettiVBox.getChildren().addAll(food[5], addFood[5]);
        spaghettiVBox.setSpacing(5);

        FlowPane left3 = new FlowPane();
        left3.getChildren().addAll(spaghettiBox, spaghettiVBox);
        left3.setHgap(10);

        VBox leftFood = new VBox();
        leftFood.getChildren().addAll(left, left2, left3);
        leftFood.setSpacing(30);
        leftFood.setAlignment(Pos.TOP_CENTER);
        bord.setLeft(leftFood);

        HBox naskunBox = new HBox();
        naskunBox.getChildren().addAll(getImg[2]);
        naskunBox.setSpacing(10);
        VBox naskunVBox = new VBox();
        naskunVBox.getChildren().addAll(food[2], addFood[2]);
        naskunVBox.setSpacing(5);

        FlowPane middle1 = new FlowPane();
        middle1.getChildren().addAll(naskunBox, naskunVBox);
        middle1.setHgap(10);

        HBox sotoBox = new HBox();
        sotoBox.getChildren().addAll(getImg[3]);
        sotoBox.setSpacing(10);
        VBox sotoVBox = new VBox();
        sotoVBox.getChildren().addAll(food[3], addFood[3]);
        sotoVBox.setSpacing(5);

        FlowPane middle2 = new FlowPane();
        middle2.getChildren().addAll(sotoBox, sotoVBox);
        middle2.setHgap(10);

        HBox nasgorBox = new HBox();
        nasgorBox.getChildren().addAll(getImg[4]);
        nasgorBox.setSpacing(10);
        VBox nasgorVBox = new VBox();
        nasgorVBox.getChildren().addAll(food[4], addFood[4]);
        nasgorVBox.setSpacing(5);

        FlowPane middle3 = new FlowPane();
        middle3.getChildren().addAll(nasgorBox, nasgorVBox);
        middle3.setHgap(10);

        VBox middleFood = new VBox();
        middleFood.getChildren().addAll(middle1, middle2, middle3);
        middleFood.setSpacing(30);
        middleFood.setAlignment(Pos.TOP_CENTER);
        bord.setRight(middleFood);

        // HBOX untuk menyimpan semua makanan
        HBox allFood = new HBox();
        allFood.getChildren().addAll(leftFood, middleFood);
        allFood.setSpacing(10);
        bord.setCenter(allFood);


        Circle circle[] = { new Circle(), new Circle()};
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

        upperMenu.setPadding(new Insets(10,10,0,0));
        upperMenu.setId("upperMenu");
        upperMenu.getChildren().addAll(minimize,exit);
        upperMenu.setSpacing(10);
        upperMenu.setAlignment(Pos.TOP_RIGHT);
        upperMenu.setPrefHeight(20);
        upperMenu.setPrefWidth(600);
        
        AnchorPane.setTopAnchor(upperMenu, 0.0);
        AnchorPane.setBottomAnchor(upperMenu, 420.0);
        AnchorPane.setLeftAnchor(upperMenu, 150.2);
        AnchorPane.setRightAnchor(upperMenu, 0.0);

        AnchorPane.setTopAnchor(box, 0.0);
        AnchorPane.setBottomAnchor(box, 20.0);
        AnchorPane.setLeftAnchor(box, 0.0);
        AnchorPane.setRightAnchor(box, 700.0);

        AnchorPane.setTopAnchor(bord, 100.0);
        AnchorPane.setBottomAnchor(bord, 50.0);
        AnchorPane.setLeftAnchor(bord, 205.0);
        AnchorPane.setRightAnchor(bord, 50.0);

        Cart cart = new Cart(stage, 0);
        cart.addToCart(addFood, foodCost, menu, btnImg);

        exit.setOnAction(e -> System.exit(0));

        minimize.setOnAction(e -> {
                ((Stage) ((Button) e.getSource()).getScene().getWindow()).setIconified(true);
        });

        pane.getChildren().addAll(box, bord, upperMenu);
        pane.setId("anchor");
    }

    /**
     * @return the anchor
     */
    public AnchorPane getAnchor() {        
        return pane;
    }

    



}