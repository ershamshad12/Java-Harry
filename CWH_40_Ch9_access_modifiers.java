class MyEmployee{

    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int getId(){
        return id;
    }
}


public class CWH_40_Ch9_access_modifiers {
    public static void main(String[] args) {

        // creating object

        MyEmployee m1= new MyEmployee();
//        m1.id=01;
//        m1.name="CodewithHarry"; // Thorws an error due to private access modifiers

         m1.setName("CodeWithHarry");
        System.out.println(m1.getName());
        m1.setId(101);
        System.out.println(m1.getId());

    }
}
