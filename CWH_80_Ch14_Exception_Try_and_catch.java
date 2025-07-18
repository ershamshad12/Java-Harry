public class CWH_80_Ch14_Exception_Try_and_catch {
    public static void main(String[] args) {
        int a=6000;
        int b=0;

//        Without Try Block :
//        int c=a/b;

//        System.out.println("The result of c is : " + c);

//        With Try Block
        try {
            int c=a/b;
            System.out.println("The Result of c is : " + c);
        }
        catch (Exception e){
            System.out.print("We failed to divid. Reason =>: ");
            System.out.println(e);
        }
        System.out.println("Program End");
    }
}
