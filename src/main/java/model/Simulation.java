
package model;

public class Simulation {

    public static void main(String[] args) {

        Player playerOne = new Player("Piotr", ShapeType.X);
        Player playerTwo = new Player("Marcin", ShapeType.O);
        Game game = new Game(playerOne, playerTwo);


        game.tickField(0);
        game.tickField(1);
        game.tickField(2);
        game.tickField(3);
        game.tickField(5);
        game.tickField(4);
        game.tickField(6);
        game.tickField(8);
        game.tickField(7);


    }

}







