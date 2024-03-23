package src.Exception;

public class Throw_Exception {
    public static void main(String[] args) {
        extracted(0);
    }

    private static void extracted(int b) {
        int a;
        if (b==0){
            // exception is handled by me
            throw new ArithmeticException("b cant be zero");
        }
        else {
           a =10/b;
        }
        System.out.println(a);
    }
}
