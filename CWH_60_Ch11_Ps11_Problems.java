// Problem 1

abstract class Pen{
    abstract public void write();
    abstract public void refill();
}

// Problems 2

abstract class Pen1{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen1{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("change the nib");
    }
}

// Problem 3

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey {
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("Bite");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void speak (){
        System.out.println("Speaking");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

// Problems 4

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone1 extends TelePhone{
    void call(){
        System.out.println("calling");
    }
    void ring(){
        System.out.println("ring");
    }
    void lift(){
        System.out.println("lift");
    }
    void disconnect(){
        System.out.println("disconnect");
    }

}

// Problems 6

interface TVRemote {
    void watch();
    void acting();
}

interface SmartTVRemote extends TVRemote{
    void smartGame();
    void simpleGame();
}

class SmartRemote implements SmartTVRemote {
    public void watch(){
        System.out.println("Watching");
    }
    public void acting(){
        System.out.println("Acting");
    }
    public void smartGame(){
        System.out.println("game");
    }
    public void simpleGame(){
        System.out.println("Simple game");
    }
}

public class CWH_60_Ch11_Ps11_Problems {
    public static void main(String[] args) {

        // Problem  1 & 2
        System.out.println("Problems 1 & 2");


        FountainPen fp = new FountainPen();
        fp.changeNib();

        // Problems 3
        System.out.println("Problems 3");


        Human h= new Human();
        h.eat();
        h.sleep();
        h.jump();

        // Problems 4
        System.out.println("Problems 4");


        TelePhone t1 = new SmartPhone1();

//        t1.call();  // Cannot use sleep method because the reference is TelePhone which does not have sleep method
        t1.ring();
        t1.lift();
        t1.disconnect();

        // Problems 5
        System.out.println("Problems 5");
        Monkey m1 = new Human();

        m1.bite();
        m1.jump();

//        m1.speak(); --> cannot use speak method because the reference is Monkey which does not have speak method

        BasicAnimal lovish =  new Human();

//        lovish.speak(); -->  error
        lovish.eat();
        lovish.sleep();

        // Problems 6
        System.out.println("Problems 6");

        SmartRemote sm = new SmartRemote();
        sm.acting();
        sm.watch();
        sm.smartGame();
        sm.simpleGame();



    }
}
