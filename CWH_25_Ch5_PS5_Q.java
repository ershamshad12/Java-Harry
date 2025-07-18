public class CWH_25_Ch5_PS5_Q {
    public static void main(String[] args) {
        //Question 1
        /*
        int n=4;
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */

        /*
       for(int i=1; i<=4; i++){
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.print("\n");
         */

        // Question 2

        /*
        int sum=0;
        int n=6;
        for(int i=0; i<n; i++){
            sum=sum + (2*i);

        }
        System.out.print("Sum of even number is: ");
        System.out.println(sum);
         */

       // Question 3

        /*
        int n =10;
        for (int i=n; i<=n*10; i= i+n){
            System.out.println(i);
        }
         */

        /*
        int n=5;
        for (int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " +(n*i));
        }
         */

        // Question 4

        /*
        int n =10;
        for (int i=n*10; i>=n; i=i-n){
            System.out.println(i);
        }
         */

        /*
        int m=10;
        for (int i=10; i>=1; i--){
            System.out.println(m*i);
        }
         */

        // Question 5

        /*
        int n=5;
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact *i;
        }
            System.out.println(fact);
         */

        // Questions 6

        /*
        int n=3;
        int factorial = 1;
        int i=1;
        while (i<=n){
             factorial= factorial *i;
            i++;
        }
        System.out.println(factorial);
         */

        // Question 7

        /*
        int n=4;
        for (int i=4; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=1; i<=4; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */

        // Question 7

        /*
        int n=0;
        int i=4;
        while (i>n){

        int j=0;
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
         */

        // Questions 9

        /*
        int sum=0;
        int n=8;
        for (int i=n; i<=n*10; i=i+n){
            System.out.println(i);
            sum += i;
        }
        System.out.print("The total sum of multiplication of 8 table: ");
        System.out.print(sum);
         */

        // Questions 11

        /*
        int sum = 0;
        int n=3;
        for (int i=0; i<=n; i++){
            sum += 2*i;
        }
            System.out.println(sum);
         */

        int n=4;
        int sum=0;
        int i=0;
        while(i<=n){
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);
    }
}
