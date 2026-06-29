package Inheritence.Task01;

public class Main {
    void main() {
        SmartBulb myLivingroomBulb = new SmartBulb();

        myLivingroomBulb.deviceID = "B-102";
        myLivingroomBulb.brandName = "Philips Hue";

        myLivingroomBulb.showStatus();

        myLivingroomBulb.setBrightness(80);

        myLivingroomBulb.turnOn();

        System.out.println("\n\n");

//        SmartFan myFan = new SmartFan();
    }
}
