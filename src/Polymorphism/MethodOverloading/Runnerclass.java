package src.Polymorphism.MethodOverloading;

public class Runnerclass {
    public static void main(String[] args) {
        new Person().Speak(6);
        new Person().Speak("Varun");
        new Person().Speak(3.142);
    }
}
