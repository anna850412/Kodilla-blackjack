package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;



public class BlackJack extends Application {

    private Image imageback = new Image("tapeta.jpg");
    private Image card = new Image("moto.jpg");
    private FlowPane cards = new FlowPane(Orientation.VERTICAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 300, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        cards.getChildren().add(img);

        grid.add(cards, 0, 0, 3, 1);

//        GridLayout eksperymentLayout = new GridLayout(3,3,5,5);
//        AbstractButton compsToExperiment = null;
//        compsToExperiment.setLayout (eksperymentLayout);
//
//        compsToExperiment.add (new JButton ("Przycisk 1"));
//        compsToExperiment.add (new JButton ("Przycisk 2"));
//        compsToExperiment.add (new JButton("Button 3"));
//        compsToExperiment.add (new JButton ("Przycisk o długiej nazwie 4"));
//        compsToExperiment.add (new JButton ("5"));
//        applyButton.addActionListener (new ActionListener() {
//            public void actionPerformed (ActionEvent e) {
//                // Pobierz wartość przerwy w poziomie
//                String horGap = (String) horGapComboBox.getSelectedItem ();
//                // Pobierz wartość przerwy w pionie
//                String verGap = (String) verGapComboBox.getSelectedItem ();
//                // Ustaw wartość przerwy w poziomie
//                eksperymentLayout.setHgap (Integer.parseInt (horGap));
//                // Ustaw wartość przerwy w pionie
//                eksperymentLayout.setVgap (Integer.parseInt (verGap));
//                // Skonfiguruj układ przycisków
//                eksperymentLayout.layoutContainer (compsToExperiment);
//            }
//        });

        Scene scene = new Scene(grid, 900, 900, Color.LIGHTGOLDENRODYELLOW);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
