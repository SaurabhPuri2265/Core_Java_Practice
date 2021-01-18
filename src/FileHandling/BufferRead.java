package FileHandling;

import java.io.File;
import java.io.*;

public class BufferRead {
    public static void main(String[] args) {

        File file = new File("myfile.txt");

        FileReader fileReader =null;
        BufferedReader bufferedReader=null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

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
        }finally {
            try {
                if(bufferedReader!=null)
                    bufferedReader.close();
                if(fileReader!=null)
                    fileReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close file ");
            }
        }

    }

}
