abstract class Parent {
    public Parent(){
        System.out.println("I am Parent class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{

    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good night");
    }
}

abstract class Child1 extends Parent{
    public void th(){
        System.out.println("th");
    }
}

public class CWH_53_Ch11_abstract {
    public static void main(String[] args) {

//        Parent p = new Parent();  // Error
        Child c = new Child();
//        Child1 c1  = new Child1(); error



    }
}
