package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;




import static view.TicTacToe.playerOne;
import static view.TicTacToe.playerTwo;
import static view.TicTacToe.game;



public class TicTacToeController {


    private String whoseTurn = playerOne.getChosenShape().toString();

    private void determineTurn() {
        if (whoseTurn.equals(playerOne.getChosenShape().toString())) {
            whoseTurn = playerTwo.getChosenShape().toString();
        } else {
            whoseTurn = playerOne.getChosenShape().toString();
        }
    }




    @FXML
    private GridPane gridPane;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Label winnerName;


    @FXML
    public void blockGuiWhenEndGameAndShowWinner(){
        if(game.checkWinCondition()){
            gridPane.setMouseTransparent(true);
            winnerName.setText(game.getCurrentPlayer().getName());
        }
    }

    @FXML
    void button1Pressed(ActionEvent event) {
        TicTacToe.game.tickField(0);
        button1.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button2Pressed(ActionEvent event) {
        TicTacToe.game.tickField(1);
        button2.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button3Pressed(ActionEvent event) {
        TicTacToe.game.tickField(2);
        button3.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button4Pressed(ActionEvent event) {
        TicTacToe.game.tickField(3);
        button4.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button5Pressed(ActionEvent event) {
        TicTacToe.game.tickField(4);
        button5.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button6Pressed(ActionEvent event) {
        TicTacToe.game.tickField(5);
        button6.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button7Pressed(ActionEvent event) {
        TicTacToe.game.tickField(6);
        button7.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button8Pressed(ActionEvent event) {
        TicTacToe.game.tickField(7);
        button8.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }

    @FXML
    void button9Pressed(ActionEvent event) {
        TicTacToe.game.tickField(8);
        button9.setText(whoseTurn);
        determineTurn();
        blockGuiWhenEndGameAndShowWinner();

    }





}
