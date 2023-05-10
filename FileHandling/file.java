package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class file {
    public static void main(String[] args){
        try{
            File file = new File("./FileHandling/example.txt");
            FileWriter fileWriter = new FileWriter("./FileHandling/example.txt");
            fileWriter.write("I wrote to a file!");
            fileWriter.close();
        }
        catch(IOException e) {}
    }
}
