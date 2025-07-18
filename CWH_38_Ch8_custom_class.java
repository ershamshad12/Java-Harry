class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is " +id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}


public class CWH_38_Ch8_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry= new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();
        // setting Attributes for Harry
        harry.id=101;
        harry.salary=34;
        harry.name="CodeWithHarry";

        // Setting Attributes for John
        john.id=201;
        john.salary=12;
        john.name="John khandelwaal";

        // Printing the Attributes

//        System.out.println(harry.id);
//        System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println("John salary is " +salary);
        int sal = harry.getSalary();
        System.out.println("Harry salary is "+sal);
    }
}
