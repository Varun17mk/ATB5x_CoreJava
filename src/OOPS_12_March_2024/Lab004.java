package src.OOPS_12_March_2024;

// Runner class for ATBClass and BlockClass
public class Lab004 {
    public static void main(String[] args) {
        BlockClass blockClass1; // new object is not created hence no IIB or DC is called
        BlockClass blockClass = new BlockClass(); //New object is created hence IIB or DC is called
        new BlockClass(); // again IIB and DC is called
    }

}
