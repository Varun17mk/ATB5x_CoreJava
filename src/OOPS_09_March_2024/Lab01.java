package src.OOPS_09_March_2024;

//Strings are immutable
public class Lab01 {
    public static void main(String[] args) {
        String S1 = "Varun";
        String S2 = "Varun"; // pointing towards same location of S1 string pool
        String S3 = new String("Varun"); // creates diff location in string pool
        String S4 = "varun";
        String S5 = new String("varun"); // creates diff location in string pool

        System.out.println(S1==S2); // "==" compares the location of string pool
        System.out.println(S1==S3); // "==" compares the location of string pool
        System.out.println(S1==S4); // "==" compares the location of string pool and is diff as string is diff according to case sensitivity
        System.out.println(S1==S5); // location and even string is diff

        // equals and equalsIgnorecase : - Compares the strings considering the case sensitivity but ignoring the location of it.

        System.out.println(S1.equals(S3)); // char are same regardless of location
        System.out.println(S1.equals(S5)); // case sensitive
        System.out.println(S1.equalsIgnoreCase(S3)); // ignores the case and compares the characters.


        /// String Buffer and Builder
        // These are Mutable in nature. -->> Remember this

        StringBuilder Sb3 = new StringBuilder("Varun");
        Sb3.append(" Kulkanri");
        System.out.println(Sb3); // value of Sb3 changed from "Varun" to "Varun kulkarni"

        StringBuffer str = new StringBuffer("VaruN");
        str.append(" KulkarnI");
        System.out.println(str);


        //String Buffer - Thread-safe
        //String Builder - not a Thread-safe


        // Reverse a number using stringbuilder
//        StringBuffer str = new StringBuffer("VaruN");
        str.reverse();
        System.out.println(str);


    }
}
