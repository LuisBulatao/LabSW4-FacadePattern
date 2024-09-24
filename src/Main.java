import AirConditioning.AirConditioning;
import HomeInterface.HomeInterface;
import Light.Light;
import TV.*;
import Target.HomeService;
import AirConditioning.*;




public class Main {
    public static void main(String[] args) {
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService ac = new AirConditioning();
        HomeInterface homeInterface  = new HomeInterface((TV) tv, (AirConditioning) ac, (Light)light);


        System.out.println("Turn On all Appliances:");
        homeInterface.turnOnAll();

        System.out.println("\nTurn off all Appliances:");
        homeInterface.turnOffAll();

    }
}