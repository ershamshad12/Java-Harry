public class CWH_10_Ch2_resulting_data_type {
    public static void main(String[]args){
        /*

        byte x=5;
        int y=6;
        short z=8;
        int a=y+z;
        System.out.println(a);
        float b=6.54f + x;
        System.out.println(b);
         */

        int i=56;

        int j=67;
        int c=++j;
        System.out.println(i++); //56
        System.out.println(i); //57
        System.out.println(++i); //58
        System.out.println(i); //58

        int y=7;
        System.out.println(++y*8); //64

        char ch='a';
        System.out.println(++ch);
    }
}
