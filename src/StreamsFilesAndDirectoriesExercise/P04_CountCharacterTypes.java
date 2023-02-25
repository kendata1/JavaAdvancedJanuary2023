package src.StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P04_CountCharacterTypes {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_P04.txt";

        List<Character> vowels = new ArrayList<>();
        List<Character> punctuationMarks = new ArrayList<>();

        Collections.addAll(vowels, 'a', 'e', 'o', 'i','u');
        Collections.addAll(punctuationMarks, ',','.','!','?');

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath)); PrintWriter writer = new PrintWriter(outputPath)) {

            int vowelsSum = 0;
            int punctuationMarksSum = 0;
            int otherSymbolsSum = 0;

            while (reader.ready()){
                String currentLine = reader.readLine();
                for (int i = 0; i < currentLine.length(); i++) {
                    char currentSym = currentLine.charAt(i);

                    if (currentSym != ' '){
                        if (vowels.contains(currentSym)){
                            vowelsSum++;
                        } else if (punctuationMarks.contains(currentSym)){
                            punctuationMarksSum ++;
                        } else {
                            otherSymbolsSum ++;
                        }
                    }
                }
            }
            writer.printf("Vowels: %d%nOther symbols: %d%nPunctuation: %d",vowelsSum,otherSymbolsSum,punctuationMarksSum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
