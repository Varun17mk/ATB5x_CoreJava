package src.Abstraction.Interface;

public class Car implements Engine, Brakes { // This is base or parent class which implements interfaces
    public void start(){
        System.out.println("Starting the car");
        startEngine();
        brake();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is started");
    }

    @Override
    public void brake() {
        System.out.println("Brakes are applied");
    }
}
