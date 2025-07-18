import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class CWH_83_Ch14_Exception_class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        if (a < 9) {
            try {

//                throw new MyException();
                throw new ArithmeticException("This is an Exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println("===================");
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finshed");
            }
            System.out.println("Yes finished last");
        }

    }
}
