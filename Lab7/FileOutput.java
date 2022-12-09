package Lab7;

import java.io.File;
import java.io.IOException;


public class FileOutput {
    /** create a new file using string from original file **/
    public static void createFile(String filename) {
        try {
            File outStream = new File ("../INFO5100/Lab7/" + filename);
            if (outStream.createNewFile()) {
                System.out.println("File created: " + outStream.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("createFile error occurred.");
            e.printStackTrace();
        }
    }
}
