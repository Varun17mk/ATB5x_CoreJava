package src.Basics_Java_Prg._23rd_March2024;

public class String_to_long {
    public static void main(String[] args) {

        String s = "123456789";
        System.out.println("String s --> "+s);

        //1. Using Long.parseLong() method of Long Class
//        long l1 =Long.parseLong(s);
//        System.out.println("Long l1 --> "+l1);

        //2. Using valueOf() Method of Long Class
        long l2 = Long.valueOf(s);
        System.out.println("long l2 --> "+l2);

    }
}
