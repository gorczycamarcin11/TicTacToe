package model;


import java.util.HashSet;
import java.util.Set;

public class Player {

    private String name;
    private ShapeType chosenShape;
    Set<Integer> tableStatus = new HashSet<>();

    public Player(String name, ShapeType chosenShape) {
        this.name = name;
        this.chosenShape = chosenShape;
    }

    public String getName() {
        return name;
    }

    public ShapeType getChosenShape() {
        return chosenShape;
    }

    public void addMarkedField(int markedField) {

        tableStatus.add(markedField);
    }

}

