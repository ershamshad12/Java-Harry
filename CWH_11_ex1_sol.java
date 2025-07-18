import java.util.Scanner;

public class CWH_11_ex1_sol {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st subject");
        int s1=sc.nextInt();
        System.out.println("Enter your 2nd subject");
        int s2=sc.nextInt();
        System.out.println("Enter your 3rd subject");
        int s3=sc.nextInt();
        System.out.println("Enter your 4th subject");
        int s4=sc.nextInt();
        System.out.println("Enter your 5th subject");
        int s5=sc.nextInt();

        double total=((s1+s2+s3+s4+s5)/500.0)*100;
        System.out.printf("Overall percentage are: %.2f%%\n", total);
    }
}
