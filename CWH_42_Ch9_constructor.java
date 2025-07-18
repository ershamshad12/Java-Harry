class MyMainEmployee{
    private int id;
    private String name;
    private int salary;
    private String address;

    // Creating Constructor
    public MyMainEmployee(){
        id=45;
        name="Md Shamshad Ansari";
    }
    // creating constructor with parameters
    public MyMainEmployee(String myName, int myId){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(String myNames){
        name=myNames;
    }
    public MyMainEmployee(int myId, String myAdd){
        id=myId;
        address=myAdd;
    }
    public MyMainEmployee(int mySalary){
        salary = mySalary;
    }

    // Initialize
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setAddress(String n){
        address=n;
    }
    public String getAddress(){
        return address;
    }
    public void setSalary(int n){
        salary=n;
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_42_Ch9_constructor {
    public static void main(String[] args) {

        MyMainEmployee m1 = new MyMainEmployee();

//        MyMainEmployee harry = new MyMainEmployee("CodewithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee(119,"sitamarhi");

        MyMainEmployee sal= new MyMainEmployee(10000);

//        harry.setName("CodeWithHarry");
//        harry.setId(234);
        System.out.println(m1.getName());

        System.out.println(harry.getId());
        System.out.println(harry.getAddress());

        System.out.println(sal.getSalary());

    }
}
