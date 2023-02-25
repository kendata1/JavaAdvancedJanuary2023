package src.StreamsFilesAndDirectoriesLAB;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P05_output.txt";

        Scanner reader = new Scanner(new FileReader(inputPath));

       try (PrintWriter out = new PrintWriter(outputPath)) {
           int counter = 1;
           while (reader.hasNextLine()) {

               String currentLine = reader.nextLine();

               if (counter % 3 == 0){
                   out.println(currentLine);
               }
            counter++;
           }
       }
    }
}
