import java.util.Scanner;

// Problems -4
/*

class CustomException extends Exception {
    @Override
    public String getMessage() {
        return "Error is given";
    }
}
 */

// Problems - 5
class ExceptionSam extends Exception {
    @Override
    public String getMessage() {
        return "Error is given";
    }

    public static void throwexception(int i) throws ExceptionSam {
        if (i <= 5) {
            throw new ExceptionSam();
        }
    }
}

public class CWH_86_PS_14_problem1 {
    public static void main(String[] args) {

        // SYNTAX ERROR
        /*

        int a = 5;
        int b = 0
        int c = a + b;
        System.out.println(c);

        // lOGICAL ERROR
        // Q1:  Add two numbers

        int x = 5;
        int y = 2;
        int z = x * y; // Logical error
        System.out.println(z);

        // RUNNTIME ERROR

        int p = 10;
        int q = 0;
        int r = p / q;
        System.out.println(r);
         */

        //Problem 2:
        /*

        try {
            System.out.println(522 / 0);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
         */

        // Problem 3:
/*

        int[] marks = new int[5];
        marks[0] = 5;
        marks[1] = 10;
        marks[2] = 15;
        marks[3] = 20;
        marks[4] = 25;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index number");
        int idx;
        boolean flag = true;
        int i = 0;

        while (flag && i < 5) {
            try {

                idx = sc.nextInt();
                System.out.println("The value of marks[idx] is " + marks[idx]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }

        }
        if(i>=5){
            System.out.println("Error");
        }
 */

        // Problem 4:

        /*

        int[] marks = new int[2];
        marks[0] = 5;
        marks[1] = 10;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index number");
        int idx;
        boolean flag = true;
        int i = 0;
        while (flag && i < 5) {
            try {

                idx = sc.nextInt();
                System.out.println("The value of marks[idx] is " + marks[idx]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }


        if (i >= 5) {
            try {
                throw new CustomException();
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
         */

        // Problems - 5


        int[] marks = new int[2];
        marks[0] = 5;
        marks[1] = 10;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index number");
        int idx;
        boolean flag = true;
        int i = 0;
        while (flag && i < 5) {
            try {

                idx = sc.nextInt();
                System.out.println("The value of marks[idx] is " + marks[idx]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }

        if (i >= 5) {
            try {
                ExceptionSam.throwexception(i);
            } catch (ExceptionSam e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
