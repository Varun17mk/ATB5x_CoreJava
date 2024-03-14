package src.Apnacollege_oops;


class Student{
    String name;
    int age;
    Student(){ //Default constructor
        System.out.println("Default constructor");
    }
}
public class OOPS_2 {
    public static void main(String[] args) {
        Student S1 = new Student();// Calling Default constructor
        new Student();
    }
}
