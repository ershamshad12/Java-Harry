class Cylinder{
    private int height;
    private int radius;



    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height=height;
    }

    // Problem 2
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }

    public double surfaceVolume(){
        return Math.PI*radius*radius*height;
    }

    // Problem 3

    public Cylinder(int height, int radius){
        this.height=height;
        this.radius=radius;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1(){
        this.length=4;
        this.breadth=5;
    }

    public Rectangle1(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

// Problem 5

class Sphare{
    private double radius;

    public double getRadius(){
        return 4*Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getVolume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
    public void setVolume(double radius){
        this.radius=radius;
    }
}


public class CWH_44_Ch9_Ps9_Problems {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(12,9);

        /*
        c1.setHeight(12);
        c1.setRadius(9);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
         */

        // Problem 2
        /*

        System.out.println(c1.surfaceArea());
        System.out.println(c1.surfaceVolume());
         */

        // Problem 3

        /*
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
         */

        // Problem 4
        /*

        Rectangle1 r1 = new Rectangle1();
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
         */

        // Problem 5

        Sphare s1= new Sphare();

        s1.setRadius(2);
       double sphareArea= s1.getRadius();
        System.out.println(sphareArea);

        // doubt to calculations
        s1.setVolume(2);
        double sphareVolume= s1.getVolume();
        System.out.println(sphareVolume);




    }
}
