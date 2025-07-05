public class CWH_17_logical {
    public static void main(String[] args) {
        System.out.println("For logical AND Operator: && ");
        boolean a = true;
        boolean b = true;
        boolean c = true;

        if(a && b && c){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("For logical OR Operator: || ");
        boolean x = true;
        boolean y = true;
        boolean z = false;

        if( x || y || z){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("For logical NOT Operator: ! ");
        boolean p=true;
        boolean q=false;

        System.out.print("Not(p) is ");
        System.out.println(!p);
        System.out.print("Not(q) is ");
        System.out.print(!q);
    }
}
