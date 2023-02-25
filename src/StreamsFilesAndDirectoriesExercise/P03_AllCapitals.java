package src.StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class P03_AllCapitals {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_P03.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)) {

            while (reader.ready()) {

                String currentLine = reader.readLine();

                writer.println(currentLine.toUpperCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
