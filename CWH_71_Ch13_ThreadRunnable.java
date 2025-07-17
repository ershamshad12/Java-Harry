class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<200){
        System.out.println("I am a Thread 1 not a Threat 1");
            System.out.println("I am a Winner");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run(){

        int i=0;
        while (i<200){

        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Loser");
        i++;
        }
    }
}


public class CWH_71_Ch13_ThreadRunnable {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 =new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
