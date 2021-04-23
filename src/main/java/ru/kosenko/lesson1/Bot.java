package ru.kosenko.lesson1;

public class Bot implements RunAwayJump {


    private final String name;
    private final String type;
    private final int maxRun;
    private final int maxJump;

    public Bot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.type = "Робот";
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

}
