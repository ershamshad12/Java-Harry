class MorningThread2 extends Thread {
    public void run(){

        int i=1;
        while(i<200){
            System.out.println("Good Morning");
            i++;
        }
    }
}

class WelcomeThread2 extends Thread {
    public void run(){

        int j=1;
        while (j<200){
            try{
            Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Welcome");
            j++;
        }
    }
}

public class CWH_76_Practice_set_13_Problem2 {
    public static void main(String[] args) {

        MorningThread2 obj1 = new MorningThread2();
        WelcomeThread2 obj2 = new WelcomeThread2();

        obj1.start();
        obj2.start();

    }
}


