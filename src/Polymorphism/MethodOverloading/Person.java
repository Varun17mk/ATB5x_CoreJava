package src.Polymorphism.MethodOverloading;

public class Person {
    // Method overloading - multiple methods with same name but diff arguments
    void Speak(String a){
        System.out.println(" A is a String--> "+a);
    }
    void Speak(int x){
        System.out.println(" X is a Int--> "+x);
    }

    void Speak(double y){
        System.out.println(" Y is double--> "+y);
    }
}


