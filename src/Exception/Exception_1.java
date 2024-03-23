package src.Exception;
import java.io.File;
import java.io.FileReader;
//Using try catch method
// exception is handled by JVM


public class Exception_1 {
    public static void main(String[] args) {
        try{
            String path="C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
