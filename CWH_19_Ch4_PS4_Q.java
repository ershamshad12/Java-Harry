import java.util.Scanner;

public class CWH_19_Ch4_PS4_Q {
    public static void main(String[] args) {

        // Question: 1
        /*

        int a=10;
        if(a==11) {
            System.out.println("I'm 11");
        }
        else{
            System.out.println("I'm not 11");
        }

         */

        // Questions 2

        /*


        byte s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
         s1 = sc.nextByte();
        System.out.println("Enter 2nd suubject marks");
         s2 = sc.nextByte();
        System.out.println("Enter 3rd subject marks");
         s3 = sc.nextByte();
        float total = s1 + s2 + s3;
        float percentage = (total)/3.0f;
        System.out.printf("Overall perentage are : %.2f%%\n " , percentage);

        if(percentage >=40 && s1>33 && s2>33 && s3>33 ){
            System.out.println("Pass");
        }else {
            System.out.println("fail");
        }
         */

        // Question 3

        /*


        double income;
        double tax =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee income per annum");
        income = sc.nextDouble();

        if(income > 250000 && income <= 500000){
            tax = income * 0.05;
            System.out.println("You will be paying  5% of your income = "+ tax);
        }
        else if(income > 500000 && income <= 1000000){
            tax= income*0.10;
            System.out.println("You are paying 10% of your income = " + tax);
        }
        else if(income > 1000000){
            tax = income * 0.30;
            System.out.println("You are paying 30% of your income = " + tax);
        }
        else {
            System.out.println("You are not paying any taxes because your income is below 2.5 lakhs");
        }
         */

        // Question 4

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You are Entered wrong day plesse try again");
        }
        System.out.println("Have a good week dear!!");
         */

        /*


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha day");
        int day= sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */
        // Question 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }


    }
}
