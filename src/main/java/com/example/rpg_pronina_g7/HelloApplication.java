package com.example.rpg_pronina_g7;

import com.isep.rpg.Game;
import com.isep.utils.ConsoleParser;
import com.isep.utils.InputParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        InputParser inputParser = new ConsoleParser();
        Game game = new Game(inputParser);
        game.start();
    }
}