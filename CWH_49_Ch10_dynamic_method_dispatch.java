class Phone{
    public void greet(){
        System.out.println("Good morning");
    } public void showTimet(){
        System.out.println("Time is 8 PM");
    }
    public void on(){
        System.out.println("Turning on Phone.......");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone.......");

    }
}

public class CWH_49_Ch10_dynamic_method_dispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
//        SmartPhone obj2 = new Phone();  // Not allowed

        obj.greet();
        obj.on();
        obj.showTimet();
//        obj.music(); // not allowed
    }
}
