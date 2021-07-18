import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling {

    //creating a new file if the file doesn't exist in the system

    public static void CreateFile(String filePath) {

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static boolean WriteToFile(String filePath,String content) {

        try {
            FileWriter myWriter = new FileWriter(filePath);
            // Writes this content into the specified file
            myWriter.write(content);
            // Closing is necessary to retrieve the resources allocated
            myWriter.close();
            System.out.println("Successfully written into to the file.");
            return true;
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }

    }


    public static String ReadFile(String filePath) {

        String data=null;

        try {
// Creating an object of the file for reading the data
            File file = new File(filePath);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                //data.concat(myReader.nextLine());
                data += "\n" + myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return data;

    }

    public static String GetInfo(String filePath) {

        String fileInfo = null;

        File file = new File(filePath);

        if (file.exists()) {
            // Returning the file name
            fileInfo = "fileName="+file.getName() + "\n AbsolutePath=" + file.getAbsolutePath() + "\n Can Write="+ file.canWrite() + "\n Can Read =" + file.canRead() + "\n File Length=" + file.length();

        } else {
            System.out.println("The file does not exist.");
        }

            return fileInfo;
    }


}


