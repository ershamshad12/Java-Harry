import java.util.Scanner;

public class CWH_06_Q1 {
    public static void main(String[]args){
        System.out.println("Calculate student marks percentages");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter java marks");
        int java=sc.nextInt();
        System.out.println("Enter SQL marks");
        int sql=sc.nextInt();
        System.out.println("Enter JavaScript marks");
        int js=sc.nextInt();
        System.out.println("Enter React.js marks");
        int react = sc.nextInt();
        System.out.println("Enter CSS marks");
        int css=sc.nextInt();

        double percentage=(java+sql+js+react+css)/5.0;
        System.out.printf("Overall percentage of all subjects are: %.2f%%\n", percentage);
//        System.out.println(percentage);
        sc.close();
    }
}
