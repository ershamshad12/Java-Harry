interface MyCamera2{

    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }

    // default method in inetrface
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K.....");
    }
}

interface MyWifi2{

    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{

    void callNumber( int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting.......");
    }
}

class MySmartPhone2 extends MyCellPhone implements MyCamera2, MyWifi2{

    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recording in 4K");
//    }

    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "Sam", "Samar"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }

}


public class CWH_59_Ch11_polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2();  // This is a smartphone but, use it as a camera
//        cam1.getNetworks(); --> Not allowed
//        cam1.sampleMeth(); // Not allowed
        cam1.record4KVideo();

        MySmartPhone2 s = new MySmartPhone2();

        s.recordVideo();
        s.sampleMeth();
        s.getNetworks();
        s.callNumber(776607530);

    }
}
