package Inheritence.Task01;

public class SmartBulb extends SmartDevice {
    private int brightness;

    public void setBrightness(int brightness) {
        if(brightness>=0){
        this.brightness = brightness;
        }
    }
}
