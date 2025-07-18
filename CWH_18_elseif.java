import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {

        String name="shamshad";

        switch (name){
            case "rohan":
                System.out.println("you are going to  become an adult " +name);
                break;
            case "shamshad":
                System.out.println("you are going to join  a job " +name);
                break;
            case "shammu":
                System.out.println("you are going to get retired " + name);
                break;
            default:
                System.out.println("Enjoy your life! " + name);
        }
        System.out.println("Thanks for useing my Java code");


        /*

        int age;
        System.out.println("Enter Your age");
        Scanner sc =new Scanner(System.in);
        age = sc.nextInt();


        if(age>56){
            System.out.println("You are experienced");
        } else if (age>46) {
            System.out.println("U r semi-experienced");

        }else if(age>36){
            System.out.println("u r semi-semi-experienced");
        }
        else {
            System.out.println("u r not experienced");
        }
        if(age>2){
            System.out.println("u r not a baby");
        }
         */

    }
}
