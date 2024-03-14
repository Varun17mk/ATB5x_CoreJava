package src.Apnacollege_oops;

class Person{
    String name;
    int age;

    public void DisplayInfo(String name){
        System.out.println(name);
    }

    public void DisplayInfo(int age){
        System.out.println(age);
    }

    public void DisplayInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Polymorphisom {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.name = "Varun";
        P1.age = 23;
        P1.DisplayInfo(P1.name, P1.age);
        P1.DisplayInfo(P1.name);
    }
}
