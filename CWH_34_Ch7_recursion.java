public class CWH_34_Ch7_recursion {

        // factorial(0) = 1;
        // factorial(n) = n* n-1 *.....1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)
    /*

    public static int factorial(int n){

        if( n==0 || n==1){
            return  1;
        } else {
            return  n * factorial(n-1);
        }
    }

    public static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            int product =1;
            for (int i=1; i<=n; i++){
                product = product*i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x =5;
        System.out.println("The value of factorial x is : " + factorial(x));
        System.out.println("The value of factorial x is : " + factorial_iterative(x));

    static int fibo(int n){
        // base case =>   jaha mera recursion rukega🤚🫷🚫  warna mera recursion infinite loop me chala jayega aur kabhi code rukega hi nhi ♾️

        if (n == 0)
            return 0;
        if (n==1)
            return 1;

        return fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] args) {

        int n=8;
        System.out.println("The value of fibonacii series at 8 position is : " + fibo(n));

     */

    static int fibonacci(int n){
        if( n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println("The value of fibonacci at position 7 is : " + fibonacci(n));
    }


}
