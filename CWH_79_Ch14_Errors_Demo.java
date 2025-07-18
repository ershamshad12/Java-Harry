import java.util.Scanner;

public class CWH_79_Ch14_Errors_Demo {
    public static void main(String[] args) {

        // 1:  SYNTAX ERROR

//        int a = 0  Error: no semicolon!
//        b = 2;     Error: b is tot Declared!


//        2: LOGICAL ERROR
//        Write a  Program to print all Prime numbers between 1 to 10

        System.out.println(2);
        for(int i=1; i<5 ;i++) {
            System.out.println(2*i+1);
        }
            System.out.println("End");

//        3 : RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("The Integer part of 1000 divided by k is " + 1000/k);
    }
}
