package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Game;
import model.Player;
import model.ShapeType;
import java.io.IOException;


public class TicTacToe extends Application {

    static Player playerOne = new Player("Player 1", ShapeType.O);
    static Player playerTwo = new Player("Player 2", ShapeType.X);
    static final Game game = new Game(playerOne, playerTwo);


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = fxmlSceneGraph();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.getIcons().add(new Image(TicTacToe.class.getResourceAsStream("/ticTacToeIcon.jpg")));
        primaryStage.show();

    }

    private Parent fxmlSceneGraph() throws IOException {
       return FXMLLoader.load(getClass().getResource("/ticTacToeFx.fxml"));
    }


    public static void main(String[] args) {

        Application.launch();



    }

}