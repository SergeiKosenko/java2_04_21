package ru.kosenko.lesson1;

public class ExampleInterface {

    public static void main(String[] args){

        RunAwayJump[] runAwayJumps = {
                new Human("Федор", 1000, 150),
                new Cat("Мурзик", 300, 10),
                new Bot("Электроник", 30000, 300 ),
                new Human("Егор", 4000, 100),
                new Cat("Матроскин", 250, 25),
                new Bot("Балбес", 20000, 100 )
        };
        WallTreadMill[] wallTreadMills = {
                new Wall(5),
                new TreadMill(100),
                new Wall(20),
                new TreadMill(250),
                new Wall(100),
                new TreadMill(20000),
                new Wall(300),
                new TreadMill(40000)
        };
        for (RunAwayJump runAwayJump : runAwayJumps){
            for (WallTreadMill wallTreadMill : wallTreadMills) {
        if (wallTreadMill instanceof Wall) {

                runAwayJump.jump(wallTreadMill.getHeight());
//              barrier.jump();
                  }
        else {
//              barrier.run();
            runAwayJump.run(wallTreadMill.getDistance());
        }
            }
        }
    }
}


//    Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//        Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
//
