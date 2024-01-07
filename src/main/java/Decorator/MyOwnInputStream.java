package Decorator;

import Decorator.InputStreamDekorator.ToLowerCaseInputStream;

import javax.swing.*;
import java.io.*;

public class MyOwnInputStream {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream inputStream = null;
        try{
            inputStream = new ToLowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/resources/test.txt")
                    )
            );
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
                //System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
