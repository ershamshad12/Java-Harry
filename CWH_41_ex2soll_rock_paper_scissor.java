import java.util.Random;
import java.util.Scanner;

public class CWH_41_ex2soll_rock_paper_scissor {
    public static void main(String[] args) {

        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        int userInput= sc.nextInt();
//        System.out.println(userInput);
        Random random= new Random();
        int computerInput = random.nextInt( 3);

        if (userInput == computerInput ){
            System.out.println("Draw");
        }else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You win");
        }else {
            System.out.println("Computer win");
        }
//        System.out.println("Computer choice: " + computerInput);

        if (computerInput ==0){
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1){
            System.out.println("Computer choice: Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer choice: Scissor");
        }
    }
}
