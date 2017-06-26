package model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Game {

    private Player playerOne;
    private Player playerTwo;

    private Player currentPlayer;


    private ArrayList<ShapeType> gridStatus = new ArrayList<>(9);

    private Set[] winConditions = new Set[8];

    private Set<Integer> createWinCondition(int i1, int i2, int i3) {
        Set<Integer> singleWinCondition = new HashSet<>();
        singleWinCondition.add(i1);
        singleWinCondition.add(i2);
        singleWinCondition.add(i3);
        return singleWinCondition;
    }

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        playerOne.getChosenShape();
        playerTwo.getChosenShape();

        for (int i = 0; i < 9; i++) {
            gridStatus.add(ShapeType.EMPTY);
        }
        winConditions[0] = createWinCondition(0, 1, 2);
        winConditions[1] = createWinCondition(3, 4, 5);
        winConditions[2] = createWinCondition(6, 7, 8);
        winConditions[3] = createWinCondition(0, 3, 6);
        winConditions[4] = createWinCondition(1, 4, 7);
        winConditions[5] = createWinCondition(2, 5, 8);
        winConditions[6] = createWinCondition(0, 4, 8);
        winConditions[7] = createWinCondition(2, 4, 6);

        currentPlayer = playerOne;
    }

    public Player getCurrentPlayer() {

        return currentPlayer;
    }

    public void nextTurn() {

        currentPlayer = (currentPlayer == playerOne ? playerTwo : playerOne);
        System.out.println("Teraz tura: " + currentPlayer.getChosenShape());
    }

    public boolean checkWinCondition() {

        boolean winCondition = false;

        for (int i = 0; i < winConditions.length; i++) {
            if (currentPlayer.tableStatus.containsAll(winConditions[i])) {
                winCondition = true;
                break;
            }
        }
        return winCondition;
    }


    public void tickField(int fieldNumber) {
        if (gridStatus.get(fieldNumber) != ShapeType.EMPTY) {
            return;
        } else {
            currentPlayer.addMarkedField(fieldNumber);

            gridStatus.set(fieldNumber, currentPlayer.getChosenShape());

            System.out.println("Sprawdzam: " + checkWinCondition());

            if (checkWinCondition()) {
                System.out.println("Wygrał: " + currentPlayer.getName());
            } else if (!gridStatus.contains(ShapeType.EMPTY)) {
                System.out.println("GAME OVER");
            } else {
                nextTurn();
            }
        }
    }
}




