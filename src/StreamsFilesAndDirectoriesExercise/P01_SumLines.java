package src.StreamsFilesAndDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01_SumLines {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = basePath + "\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))) {

            while (bufferedReader.ready()){
                String line = bufferedReader.readLine();
                int sum = 0;

                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    sum += currentChar;
                }
                System.out.println(sum);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
