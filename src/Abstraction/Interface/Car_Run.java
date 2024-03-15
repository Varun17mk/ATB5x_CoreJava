package src.Abstraction.Interface;

public class Car_Run extends Car { // this is child or derived class of "Car class"
    public static void main(String[] args) {
        Car_Run c = new Car_Run();
        c.start();
    }
}

// Here we are not able to c brakes and engine interface codes.
// this is what abstraction is - showing only what is needed.
