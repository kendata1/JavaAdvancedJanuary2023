package src.StreamsFilesAndDirectoriesLAB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P04_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        try (PrintWriter out = new PrintWriter(outputPath)) {
            while (reader.hasNext()){

                if (reader.hasNextInt()){
                    out.println(reader.nextInt());
                }
                reader.next();
            }
        }
    }
}
