package Lab7;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    /** Read from assigned file and return string to show on GUI **/
    public static String readToShow(String filepath, int n, boolean firstlineprint) {
        String readStr = "<html>";
        int lineNum = n;
        if (!firstlineprint) {
            lineNum += 1;
        }
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                System.out.println("test");
                String data = myReader.nextLine();
                if (firstlineprint) {
                    readStr += data + "<br/>";
                }
                else {
                    if (lineNum != n + 1) {
                        readStr += data + "<br/>";
                    }
                }
                lineNum -= 1;
                if (lineNum == 0) {
                    break;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("readToShow error occurred.");
            e.printStackTrace();
        }
        return readStr + "</html>";
    }

    /** Read from file and return string to write **/
    public static String readToWrite() {
        String readStr = "";
        int lineNum = 5;
        try {
            File myObj = new File("../INFO5100/Lab7/Annual.csv");
            Scanner myReader = new Scanner(myObj);
            while (lineNum >= 0) {
                String data = myReader.nextLine();
                if (lineNum != 5) {
                    readStr += data + "\n";
                }
                lineNum -= 1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("readToWrite error occurred.");
            e.printStackTrace();
        }
        return readStr;
    }
}
