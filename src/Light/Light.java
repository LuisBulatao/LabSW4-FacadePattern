package Light;

import Target.HomeService;

public class Light implements HomeService {

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }

    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }
}
