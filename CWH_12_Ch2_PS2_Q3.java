import java.util.Scanner;

public class CWH_12_Ch2_PS2_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenNumber=50;
        System.out.println("enter user number");
        int a=sc.nextInt();
        System.out.println(givenNumber>a);
        sc.close();
    }
}
