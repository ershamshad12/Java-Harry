public class CWH_22_Ch5_do_while {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(" before the start");
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        System.out.println("after the run");

        System.out.println("=================");

       int i=0;
       do{
           System.out.println(i);
           i++;
       }while(i<10);
        System.out.println("ends do while loop");

        int p=1;
        do{
            System.out.println(p);
            p++;
        } while (p<=99);
}
}
