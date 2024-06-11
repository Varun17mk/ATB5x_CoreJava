package src.Polymorphism.MethodOverriding;

public class RunnerClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Ruby r = new Ruby();
        r.bark();

        //imp
//        Dog h = new Ruby();
//        h.bark(); // calls ruby itself as Ruby's object is created
        // Runtime polymorphism
        // also called Dynamic Dispatch

    }
}
