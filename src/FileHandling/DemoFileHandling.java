package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoFileHandling {
    public static void main(String[] args) {

        //Using File class

        try {
            File file = new File("myfile.txt");

            //Use scanner class to work with scanner object
            Scanner input = null;
            input = new Scanner(file);

            while(input.hasNext())
            {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        //System.out.println(new File("myfile.txt").getAbsolutePath());

    }
}
