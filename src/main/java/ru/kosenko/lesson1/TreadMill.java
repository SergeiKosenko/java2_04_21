package ru.kosenko.lesson1;

public class TreadMill implements WallTreadMill {
    private final int distance;

    public TreadMill(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}