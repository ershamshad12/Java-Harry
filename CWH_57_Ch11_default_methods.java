interface MyCamera{

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

interface MyWifi{

    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{

    void callNumber( int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting.......");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{

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
        System.out.println("Connecting to "+ network);
    }

}

public class CWH_57_Ch11_default_methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();

        ms.record4KVideo();
//        ms.greet(); // throws an error
        String[] arr =  ms.getNetworks();

        for (String items: arr){
            System.out.println(items);
        }

    }
}
