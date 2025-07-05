public class CWH_35_Ch7_Ps7_questions {

        /*
        // Question 1
    public static void multi(int n){
        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d\n",n, i,n*i);
        }
    }

    public static void main(String[] args) {
      multi(8);
    }
         */

    // Questions 2
    /*
        static void star(int n){
            for(int i=1; i<=n; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    public static void main(String[] args) {
        star(4);
    }
     */

    // Questions 3
    /*

    // sum(n) = 1 + 2 + 3.................+n
    // sum(n) = 1 + 2 + 3.................+ n-1 + n
    // sum(n) = sum(n-1) + n
    // sum (3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1

    static int sumRec(int n){

        if (n==1) return 1;
        else {
            return  n + sumRec(n-1);
        }
    }

    public static void main(String[] args) {
        int c = sumRec(4);
        System.out.println(c);
    }
     */

    // Questions 4
    /*
    static void starDec(int n){
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starDec(4);
    }
     */

    // Questions 5
    /*
    static int fibonacci(int n){

        // starting index from 1 then we used n==1 return 0 and n==2 return 1
        if (n==1 || n==2) return n-1;

//        if(n==1) return 0;
//        else if(n==2) return 1;

        // starting index from 0 then we used n==0 return 0 and n==1 return 1
//        if( n == 0 || n == 1) return n;

//        if(n==0) return 0;
//        else if (n==1)  return 1;

            else {
        return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int x=fibonacci(7);
        System.out.println(x);
    }
     */

    //  Questions 6
    /*
     static int avg(int ...arr){
         int sum = 0;
         for (int a: arr){
             sum +=a;
         }
         return sum;
     }

    public static void main(String[] args) {

     int n=3;
     int sumAvg = avg(8,4,6);
        System.out.println("The sum of 2,2 and 2 are : " + sumAvg);
        System.out.println("The average of these numbers are : " + (sumAvg)/n);
    }
     */

    // Questions 7
    /*
    static void starRecursion (int n){
        for (int i=n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starRecursion(4);
    }
     */

    // Questions 8

    // Using Recursion
    
    static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
    /*


    static void star(int n){
        for (int i=0; i<4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(4);
    }
     */

    // Questions 9



    // Question 10
    /*


    static int calSum(int n){
        int sum = 0;
        for (int i=1; i<=n; i++ ){
            sum = sum+i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int x=3;
        System.out.println(calSum(x));
     */
}

