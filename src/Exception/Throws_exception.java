package src.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_exception {
    public static void main(String[] args) throws Exception {
        readfile("C://a.txt");

    }

    static void readfile(String filename) throws Exception
    {
        File f = new File(filename);
        FileReader fileReader= new FileReader(filename);

        if (filename.length() ==0)
        {
            throw new FileNotFoundException();
        }
//        else
    }
}
