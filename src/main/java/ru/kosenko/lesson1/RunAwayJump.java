package ru.kosenko.lesson1;

public interface RunAwayJump {

    String getName();
    String getType();
    int getMaxRun();
    int getMaxJump();

    default boolean run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.printf("%s %s пробежал по беговой дорожке %d метров.\r\n", getType(), getName(), distance);
            return true;
        } else {
            System.out.printf("%s %s не пробежал по беговой дорожке %d метров, он бегает не больше %d метров.\r\n", getType(), getName(), distance, getMaxRun());
            return false;
        }
    }

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s %s перепрыгнул препятствие стены %d сантиметров.\r\n", getType(), getName(), height);
            return true;
        } else {
            System.out.printf("%s %s не перепрыгнул препятствие стены %d сантиметров, он не может преодолеть эту высоту.\r\n", getType(), getName(), height);
            return false;
        }
    }

}
