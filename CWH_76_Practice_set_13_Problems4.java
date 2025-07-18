class MorningThread4 extends Thread {
    public void run(){

        int i=1;
        while(i<200){
            System.out.println("Good Morning");
            i++;
        }
    }
}

class WelcomeThread4 extends Thread {
    public void run(){
//        System.out.println("Welcome to Thread state");
    }
}

public class CWH_76_Practice_set_13_Problems4 {
    public static void main(String[] args) {

        MorningThread4 obj1 = new MorningThread4();
        WelcomeThread4 obj2 = new WelcomeThread4();

//        obj1.setPriority(6);
//        obj2.setPriority(9);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        System.out.println(obj2.getState());

//        obj1.start();
        obj2.start();
        System.out.println("Thread State is : " +obj2.getState());

    }
}


