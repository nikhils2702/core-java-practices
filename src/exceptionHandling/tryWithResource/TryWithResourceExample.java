package exceptionHandling.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TryWithResourceExample {

    public static void main(String[] args) {

        try(FileOutputStream obj = new FileOutputStream("name.text")){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
