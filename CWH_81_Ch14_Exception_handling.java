import java.util.Scanner;

public class CWH_81_Ch14_Exception_handling {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("The value at Array index entered is: " + marks[idx]);
            System.out.println("The value of Array-value/number is: " + marks[idx] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some others exception occured");
            System.out.println(e);
        }
    }
}
