package src.StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class P05_LineNumbers {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = basePath + "\\inputLineNumbers.txt";
        String outputPath = basePath + "\\output_P05.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)) {
            int lineNumber = 1;

            while (reader.ready()){
                String currentLine = reader.readLine();

                writer.printf("%d. %s%n", lineNumber,currentLine);
                lineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
