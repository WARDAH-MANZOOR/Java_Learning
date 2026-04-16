package com.company.chapter11;
interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){ // humne yahan default method abnaya ye siliye hotaahi ke wo classes jahan ye
        // interface implement horaha hai unme agr ye wala method override nahi hua wa tou default likhne se un classes me
        // error nahi aiaga  aur agr wo override karna chahetou override bhi karsakte ahin
        System.out.println("record4kVideo");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwrok(String network);

}
class cellPhone {
    void CallNumber(int PhoneNumber){
        System.out.println("Calling number "+PhoneNumber);
    }
    void pickCall(){
        System.out.println("Picking Call");
    }

}
class smartPhone extends cellPhone implements wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of networks");
        String[] networkList = {"wardah","harry","ambreen"};
        return networkList;
    }
    public void connectToNetwrok(String network){
        System.out.println("Connecting to "+network);
    }
}
public class defaultMethods {
    public static void main(String[] args) {
        smartPhone smartPhone = new smartPhone();
        smartPhone.takeSnap();
        smartPhone.recordVideo();
        smartPhone.pickCall();
        String[] networks = smartPhone.getNetworks();
        for(String network:networks){
            System.out.println(network);
        }
        smartPhone.connectToNetwrok("wardah");

    }
}
