import java.util.Scanner;

public class CWH_Ch1_PS1_Q4 {
    public static void main(String[]args){
        System.out.println("Converts kilo meters to Miles");
        Scanner bike= new Scanner(System.in);
        System.out.println("Enter the Kilo meters");
        double kilo=bike.nextDouble();
        double convert= kilo*0.621;
        System.out.printf("%.2fmiles\n", convert);
        bike.close();
    }
}
