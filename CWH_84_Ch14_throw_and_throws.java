class NegativeRadiusException extends Exception {
    public String toString() {
        return "I am ";
    }

    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class CWH_84_Ch14_throw_and_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // Made by Harry
        int result = a / b;
        return result;

    }

    public static void main(String[] args) {

        // Shamshad :- uses divide function created by Harry

        try {

//            int c = divide(5, 0);
//            System.out.println(c);
            double arr = area(6);
            System.out.println(arr);

        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
}
