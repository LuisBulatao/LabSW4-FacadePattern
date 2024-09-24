package AirConditioning;

import Target.HomeService;

public class AirConditioning implements HomeService {

    @Override
    public void turnOff() {
        System.out.println("AirConditioning is off");
    }

    @Override
    public void turnOn() {
        System.out.println("AirConditioning is on");
    }
}
