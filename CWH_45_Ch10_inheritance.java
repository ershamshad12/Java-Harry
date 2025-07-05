/*

class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am constructor");
    }
}
 */
/*

class Derived extends Base {
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

}
 */

/*

class Animal{
    String color;
    String sound;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getSound(){
        return sound;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
}

class Dog extends Animal{
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
 */

public class CWH_45_Ch10_inheritance {
    public static void main(String[] args) {

        /*

//      Creating an object of base class
        Base b1= new Base();
        b1.setX(5);
        int valX =b1.getX();
        System.out.println(valX);

//      Creating an Object of Derived class
        Derived d1 =new Derived();
        d1.setX(43);
        d1.setY(66);
        int childClass= d1.getY();
        int resultX =d1.getX();
        System.out.println(resultX);
        System.out.println(childClass);
         */

        /*

        Dog dg = new Dog();
        dg.setColor("Black");
        dg.setSound("Bhao- Bhao");

        String animColor= dg.getColor();
        System.out.println(animColor);

        String animSound = dg.getSound();
        System.out.println(animSound);

        dg.setName("Charlie");
        System.out.println(dg.getName());
         */

    }
}
