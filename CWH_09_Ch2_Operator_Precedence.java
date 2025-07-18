public class CWH_09_Ch2_Operator_Precedence {
    public static void main(String[]args){

        //Precedence & Associativity

        int x=6*5-34/2;
        System.out.println(x);

        /*
        =6*5-34/2
        =30-17
        =13
         */
        int y=60/5-34*2;
        System.out.println(y);
        /*
        =60/5-34*2
        =12-68
        =-56
         */

        int b=1;
        int c=4;
        int a=5;
        int k = b*b -(4*a*c)/(2*a);
        System.out.println(k);

        /*
        =b*b -(4*5*4)/(2*5);
        =b*b -80/10;
        =1*1-8;
        =1-8
        =-7
         */

        int p=6;
        int q=1;
        int r=p*q/2;
        System.out.println(r);
        /*
        =6*1/2
        =6/2
        =3
         */


    }
}
