interface Bicycle{

    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{

    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }

    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }


}

public class CWH_54_Ch11_interfaces {
    public static void main(String[] args) {

        AvonCycle avon = new AvonCycle();
        avon.applyBreak(1);
        // You can create properties in Interfaces
        System.out.println(avon.a);
        // You cannot modify the properties in Interfaces as they are final
//        avon.a=456;
//        System.out.println(avon.a);

        avon.blowHornK3g();
        avon.blowHornmhn();


    }
}
