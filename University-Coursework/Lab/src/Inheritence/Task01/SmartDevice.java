package Inheritence.Task01;

public class SmartDevice {
    String brandName;
    String deviceID;

    void turnOn(){
        System.out.printf("%s device is now starting\n",brandName);
    }
    void showStatus(){
        System.out.printf("%s device is now ON\n",brandName);
    }
}
