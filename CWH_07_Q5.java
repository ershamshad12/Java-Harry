import  java.util.Scanner;
public class CWH_07_Q5 {
    public static  void main(String []args){
        System.out.println("Check the user input integer or not");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
//        int a=sc.nextInt();
        boolean a=sc.hasNextInt();
        System.out.println(a);
    }
}
