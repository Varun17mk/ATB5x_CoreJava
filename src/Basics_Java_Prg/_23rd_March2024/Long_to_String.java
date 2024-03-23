package src.Basics_Java_Prg._23rd_March2024;
//The long to String conversion in Java
// generally comes in need when we have to display a long number in a GUI application
// because everything is displayed in string form.
public class Long_to_String {
    public static void main(String[] args) {

        long l = 123456789L;
        System.out.println("long l --> "+l);

        //1] For converting any data type to string type,
        // we can simply add/+ empty string indicated by double quotes(“)
        String s1= l+" ";
        System.out.println("String s1 --> "+s1);
//        // printing the type of str to
//        // show that long has been converted to string
        System.out.println("Converted type : "
                + s1.getClass().getName());

        //2] Using valueof()
        String s2 = String.valueOf(l);
        System.out.println("String s2 --> "+s2);

        //3] Using Long.toString method
        String s3 = Long.toString(l);
        System.out.println("String s3 --> "+s3);




    }
}
