import java.util.Scanner;

public class CWH_82_Ch14_nested_try_catch {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");

        boolean flag = true;
        while (flag) {

            int idx = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[idx]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is not exist");
                    System.out.println("Exception in level 2");

                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
            System.out.println("Thanks for using this program");
        }
    }
}
