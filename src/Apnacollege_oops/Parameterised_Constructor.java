package src.Apnacollege_oops;
 class Student_ {
    String name;
    int age;
     Student_(String name,int age){ // Parameterized constructor
         this.name = name;
         this.age = age;
     }
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class Parameterised_Constructor {
    public static void main(String[] args) {
        Student_ S1 = new Student_("Varun", 23);// Calling Parametrised constructor
        S1.printinfo();
        Student_ S2 = new Student_("Varsha", 21);// Calling Parametrised constructor
        S2.printinfo();
    }
}
