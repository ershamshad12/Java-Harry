
class MorningThread5 extends Thread {
    public void run(){

        int i=1;
        while(i<200){
            System.out.println("Good Morning");
            i++;
        }
    }
}

class WelcomeThread5 extends Thread {
    public void run(){
//        System.out.println("Welcome to Thread state");
    }
}

public class CWH_76_Practice_set_13_Problems5 {
    public static void main(String[] args) {

        MorningThread5 obj1 = new MorningThread5();
        WelcomeThread5 obj2 = new WelcomeThread5();

//        obj1.setPriority(6);
//        obj2.setPriority(9);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        System.out.println(obj2.getState());

//        obj1.start();
        obj2.start();
        System.out.println("Thread State is : " + obj2.getState());
        System.out.println("Thread Current state is : " + Thread.currentThread().getState());

    }
}


