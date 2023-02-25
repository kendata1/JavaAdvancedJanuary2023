package src.StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P08_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathFileTwo = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String outputPath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output_P07.txt";

        PrintWriter writer = new PrintWriter(outputPath);

        List<String> allLinesOfFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLinesOfFileOne.forEach(line -> writer.println(line));
        List<String> allLinesOfFileTwo = Files.readAllLines(Path.of(pathFileTwo));
        allLinesOfFileTwo.forEach(line -> writer.println(line));

        writer.close();
    }
}
