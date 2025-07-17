class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=1;
        System.out.println("Thank u");
        while(i<5){
            System.out.println("Hye");
            i++;
        }
    }
}

public class CWH_73_Ch13_Thread_Constructor {
    public static void main(String[] args) {

        MyThr t1 = new MyThr("Shamshad");
        MyThr t2 = new MyThr("Harry shamshad");
        t1.start();
        t2.start();
        System.out.println("The id of Thread is : " + t1.getId());
        System.out.println("The name of Thread is : " + t1.getName());

        System.out.println("The Id of Thread is :" + t2.getId());
        System.out.println("The Name of Thread is : " + t2.getName());

    }
}
