package Lab7;

import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    /** write the string to new file **/
    public static void writeFile(String filename, String writeContent) {
        try {
            FileWriter myWriter = new FileWriter("../INFO5100/Lab7/" + filename);
            myWriter.write(writeContent);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("writeFile error occurred.");
            e.printStackTrace();
        }
    }
}
