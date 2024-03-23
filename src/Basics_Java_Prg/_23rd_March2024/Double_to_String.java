package src.Basics_Java_Prg._23rd_March2024;

//The primary goal of double to String conversion in Java is to store big streams of numbers that are coming where even data types fail to store the stream of numbers.
//It is generically carried out when we want to display the bigger values.In this article, we will learn How to Convert double to String in Java.
public class Double_to_String {
    public static void main(String[] args) {
        double d = 123.5666;

        // 1] Using Valueof() inbuilt method
//        String s1= String.valueOf(d);
//        System.out.println(s1);

        // 2] Using append() method from stringbuilder
//        String s2= new StringBuilder().append(d).toString();
//        System.out.println(s2);

        // 3]Double.toString method
        String s3 = Double.toString(d);
        System.out.println(s3);

    }
}
