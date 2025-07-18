class Base1 {
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }

}
class Derived1 extends Base1{

    Derived1(){
//        super(0);
        System.out.println("I am a derived  class constrctor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value of y as: " + y);


    }
}

class ChildOFDerived extends Derived1{
    ChildOFDerived(){
        System.out.println("I am Child of Derived constructor");
    }
    ChildOFDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor with value of z as: " + z);

    }
}

public class CWH_46_Ch10_constructor_in_inheritance {
    public static void main(String[] args) {

//        Base1 b= new Base1();
//        Derived1 d= new Derived1();
//        Derived1 d= new Derived1(14,9);

//        ChildOFDerived ch1= new ChildOFDerived();
        ChildOFDerived ch1= new ChildOFDerived(12,13,15);
    }
}
