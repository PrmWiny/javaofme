package example;

// Java Program to rename a file
import java.nio.file.*;
import java.io.IOException;


public class ren {
    public static void main(String[] args)
            throws IOException
    {

        Path oldFile
                = Paths.get("C:\\Users\\65130500110\\Desktop\\tester_java\\hee.mh");

        try {
            Files.move(oldFile, oldFile.resolveSibling(
                    "kuy.ed"));
            System.out.println("File Successfully Rename");
        }
        catch (IOException e) {
            System.out.println("operation failed");
        }
    }
}
