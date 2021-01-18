package FileHandling;

import java.io.*;

public class TryWithResourcesAndAutoclosableInterface {

    public static void main(String[] args) {

        File file = new File("myfile.txt");

        //Define reader classes inside try braces only
        //Defining inside try braces helps to auto close the reader objects
        //No need of finally block
        try(FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line=bufferedReader.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file "+file.getName());
        }

    }
}
