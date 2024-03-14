package src.Apnacollege_oops;


class Pen{  // creating class like blueprint
    String color;
    String type;// ballpoint or gel
    public void write(){
        System.out.println("Writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }

}


// objects are created in main method
public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //pen1 is an object here
        pen1.color = "blue";
        pen1.type = "Gel";

        pen1.write();// calling write function
        pen1.printcolor();// calling printcolor function
        pen1.printtype();// calling printtype function
    }
}
