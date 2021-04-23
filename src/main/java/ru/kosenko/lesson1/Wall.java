package ru.kosenko.lesson1;

public class Wall implements WallTreadMill {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getDistance() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
