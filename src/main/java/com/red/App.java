package com.red;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Board board = new Board();
        Scene scene = new Scene(board,600 , 730);
        stage.setTitle("Simulation");
        stage.setScene(scene);
        stage.show();
        board.out();
    }

    public static void main(String[] args) {
        launch();
    }
}