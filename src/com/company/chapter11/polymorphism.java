package com.company.chapter11;
// POLYMORPHISM :restrict kardena jese ye ke agr meri dost ne mujhe kaha ke apna phhone do mujhe icture
//leni hai tou me usko phonesrf picture lene ke liye doongi aur us ko allow nahi karoongi ke wo mere conatcts me jaai
// mere msgs parhe me cahongi ke wo srf camera khole aur picture le is cheez ko polymorphism kehte hain ke humne
// phone bhid edia aur restrcted bhi kardia ke srf camera hi us ekaro
interface Camera1{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){ // humne yahan default method abnaya ye siliye hotaahi ke wo classes jahan ye
        // interface implement horaha hai unme agr ye wala method override nahi hua wa tou default likhne se un classes me
        // error nahi aiaga  aur agr wo override karna chahetou override bhi karsakte ahin
        System.out.println("record4kVideo");
    }
}
interface wifi1{
    String[] getNetworks();
    void connectToNetwrok(String network);

}
class cellPhone1 {
    void CallNumber(int PhoneNumber){
        System.out.println("Calling number "+PhoneNumber);
    }
    void pickCall(){
        System.out.println("Picking Call");
    }

}
class smartPhone1 extends cellPhone1 implements wifi1,Camera1{
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
public class polymorphism {
    public static void main(String[] args) {
        Camera1 camera1 = new smartPhone1(); // camera1 ak reference dia aur object martphone ka banaya
        // matlab ye ke smartphone  dia par restricted kardia ke srf acmera use kare

    }

}
