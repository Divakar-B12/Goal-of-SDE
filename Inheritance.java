package com.FAANG.Day8;

public class Inheritance {
    public static void main(String[] args) {
        pcOne one = new pcOne();
        pcTwo two = new pcTwo();
        pcThree three = new pcThree();

        one.gameOne();
        two.gameOne();
        two.gameTwo();
        three.gameOne();
        three.gameTwo();
        three.gameThree();
    }

}

class pcOne{
    void gameOne(){
        System.out.println("All the first games can play");
    }
}

class pcTwo extends pcOne{

    void gameTwo(){
        System.out.println("game two can play");
    }
}

class pcThree extends pcTwo{

    void gameThree(){
        System.out.println("Game three can play");
    }
}
