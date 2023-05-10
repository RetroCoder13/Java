package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class file {
    public static void main(String[] args){
        try{
            File file = new File("./FileHandling/example.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("I wrote to a file!!");
            fileWriter.close();
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        }
        catch(IOException e) {}
    }
}
