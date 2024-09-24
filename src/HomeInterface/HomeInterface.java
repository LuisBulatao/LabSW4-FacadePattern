package HomeInterface;

import AirConditioning.AirConditioning;
import Light.Light;
import TV.TV;

public class HomeInterface {
    private TV tv;
    private AirConditioning airConditioning;
    private Light light;

    public HomeInterface(TV tv, AirConditioning airConditioning, Light light) {
        this.tv = tv;
        this.airConditioning = airConditioning;
        this.light = light;
    }



    public void turnOnAll() {
        this.tv.turnOn();
        this.airConditioning.turnOn();
        this.light.turnOn();

    }

    public void turnOffAll() {
        this.tv.turnOff();
        this.light.turnOff();
        this.airConditioning.turnOff();
    }

}