public class CWH_15_Ch3_PS3_Q4 {
    public static void main(String[] args) {
        String myString= "This is strings contains  double and   triple spaces";
//        System.out.println(myString.indexOf("  "));
//        System.out.println(myString.indexOf("   "));

        int doubleSpace= myString.indexOf("  ");
        int triple= myString.indexOf("   ");
        System.out.println(doubleSpace);
        System.out.println(triple);


    }
}
