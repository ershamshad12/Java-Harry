class MyNewThread1 extends Thread {
    public void run(){

        int i=1;
        while (i<200){
            System.out.println("Thank you1");

            try{
            Thread.sleep(455);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread {
    public void run(){

        int i=1;
        while(i<200){
        System.out.println("Thank you2");
        i++;
        }
    }
}

public class CWH_75_Thread_Methods {
    public static void main(String[] args) {

        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();
//        try{
//
//        t1.join();
//        } catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }
}
