class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
}

class Cellphone {
    public void ring(){
        System.out.println("ringing............");
    }
    public void vibrate(){
        System.out.println("vibrating...............");
    }
    public void callFriend(){
        System.out.println("calling friend................");
    }
}

class Square {
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}

class  Rectangle{
    int length;
    int breadth;
    public int area (){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    double pi;
    int r;
    public double area(){
        return pi*r*r;
    }
    public double perimeter(){
        return 2*pi*r;
    }
}

public class CWH_39_Ch8_Ps8_Questions {

    public static void main(String[] args) {
        System.out.println("This is my Employee class");
        /*

        // Question 1
        // Creating object
        Employee1 e1=new Employee1();

        e1.salary=30;
        e1.setName("CodeWithHarry");
//      e1.name="Shamshad";

        int salValue =e1.getSalary();
        System.out.println(salValue);
        String changeName = e1.getName();
        System.out.println(changeName);
//      String nameValue = e1.getName();
//      System.out.println(nameValue);

        // Questions 2

        Cellphone c1= new Cellphone();

        c1.ring();
        c1.vibrate();
        c1.callFriend();

        // Questions 3

        Square s1= new Square();

        s1.side=3;

        int squaResult = s1.area();
        System.out.println(squaResult);

        int paraResult = s1.perimeter();
        System.out.println(paraResult);

        // Questions 4

        Rectangle r1= new Rectangle();

        r1.length=3;
        r1.breadth=4;

        int result = r1.area();
        System.out.println(result);

        int periResult= r1.perimeter();
        System.out.println(periResult);

        // Questions 5

        Tommy t1=new Tommy();
        t1.hit();
        t1.run();
        t1.fire();
         */

        // Questions 6

        Circle c1= new Circle();

        c1.pi=3.1444;
        c1.r=3;

        double areaResult = c1.area();
        double perimeterresult= c1.perimeter();
        System.out.println(areaResult);
        System.out.println(perimeterresult);







    }
}
