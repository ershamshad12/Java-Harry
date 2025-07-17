import java.util.PriorityQueue;

class MyThreads1 extends Thread {
    public MyThreads1(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<5){

        System.out.println("Thank you: " + this.getName());
        i++;
        }

    }
}

public class CWH_74_Thread_Priorities {
    public static void main(String[] args) {
        MyThreads1 t1=new MyThreads1("Shamshad1");
        MyThreads1 t2 = new MyThreads1("Shamshad2");
        MyThreads1 t3 = new MyThreads1("Shamshad3");
        MyThreads1 t4 = new MyThreads1("Shamshad4");
        MyThreads1 t5 = new MyThreads1("Shamshad5 (Most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
