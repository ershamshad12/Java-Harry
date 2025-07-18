class MorningThread extends Thread {
    public void run(){

        int i=1;
        while(i<200){
        System.out.println("Good Morning");
        i++;
        }
    }
}

class WelcomeThread extends Thread {
    public void run(){

        int j=1;
        while (j<200){
            System.out.println("Welcome");
            j++;
        }
    }
}

public class CWH_76_Practice_set_13_Problem1 {
    public static void main(String[] args) {

        MorningThread obj1 = new MorningThread();
        WelcomeThread obj2 = new WelcomeThread();

        obj1.start();
        obj2.start();

    }
}

