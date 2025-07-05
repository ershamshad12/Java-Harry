class Circle1{

    public int radius;

    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius= r;
    }
    Circle1(){
        System.out.println("I am non param constructor of circle");
    }


    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}

class Cylinder1 extends Circle1{

    public int height;

    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class CWH_52_Ch10_Ps10_problems {
    public static void main(String[] args) {

//        Circle1 objc =  new Circle1(4);

        Cylinder1 obj1 = new Cylinder1(4,5);

    }
}
