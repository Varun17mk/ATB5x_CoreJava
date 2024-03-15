package src.Abstraction;

public abstract class Animal {
    Animal(){} // Default constructor

    void m1(){ //concrete method complete
        System.out.println("I'm m1()");
    }

    abstract void m2(); // Not completed, someone will do
}
