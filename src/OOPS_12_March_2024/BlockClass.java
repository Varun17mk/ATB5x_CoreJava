package src.OOPS_12_March_2024;

public class BlockClass {
    {
        //Instance initialisation block -IIB
        System.out.println("I am IIB");
    }

    BlockClass(){ //Default Constructor
        System.out.println("DC");
    }

    static {// SIB - Static Instance Block
        System.out.println("I am SIB");
    }
}
