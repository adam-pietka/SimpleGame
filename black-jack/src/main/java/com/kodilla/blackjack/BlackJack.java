package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlackJack extends Application {

//    private Image imageback = new Image("file:src/main/resources/table.png");
    private Image imageback = new Image("file:src/main/resources/BlackJack.png");
    private  Image card2z = new Image("file:src/main/resources/2z.png");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane cards2 = new FlowPane(Orientation.HORIZONTAL);
    private Button buttonYes = new Button("Yes");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
//        grid.add(new Button());


        ImageView img = new ImageView(card2z);
        img.setFitHeight(100);
        img.setFitWidth(80);
        cards.getChildren().add(img);
        grid.add(cards, 0, 0,3,1);
//        grid.add(cards, 0, 0,1,3);



        ImageView img2 = new ImageView(card2z);
        img2.setFitHeight(100);
        img2.setFitWidth(80);
        cards2.getChildren().add(img2);
//        grid.add(cards, 0, 0,3,1);
        grid.add(cards2, 1, 3,10,11);




        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
