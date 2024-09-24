package TV;

import Target.HomeService;

public class TV implements HomeService {

    @Override
    public void turnOff() {
        System.out.println("Tv is off");
    }

    @Override
    public void turnOn() {
        System.out.println("Tv is on");
    }

}
