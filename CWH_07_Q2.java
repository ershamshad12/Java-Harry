import java.util.Scanner;

public class CWH_07_Q2 {
    public static void main(String[]args){
        System.out.println("calculate cgpa");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        int first=sc.nextInt();
        System.out.println("Enter 2nd subject marks");
        int sec=sc.nextInt();
        System.out.println("Enter 3rd subject marks");
        int third=sc.nextInt();

        double percentage=(first+sec+third)/3.0;
        double cgpa=percentage/9.5;
        System.out.printf("Overall CGPA of all subjects are: %.2f\n", cgpa);
        sc.close();
    }
}
