import java.util.Scanner;
public class CWH_05_Input {
    public static void main(String []args){
        System.out.println("Taking input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
//        float x=sc.nextFloat();
        System.out.println("Enter number 2");
        int b= sc.nextInt();
//        float y=sc.nextFloat();
        int sum=a+b;
//        float add= x+y;
        System.out.println("The sum of these numbers is :");
        System.out.println(sum);
//        System.out.println(add);
//boolean b1=sc.hasNext();
//        System.out.println(b1);
    }
}
