package src.StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.*;

public class P06_WordCount {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String wordsPath = basePath + "\\words.txt";
        String checkPath = basePath + "\\text.txt";
        String outputPath = basePath + "\\output_P06.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(wordsPath)); BufferedReader checker = new BufferedReader(new FileReader(checkPath)); PrintWriter writer = new PrintWriter(outputPath)) {

            List<String> words = new ArrayList<>();
            words.addAll(Arrays.stream(reader.readLine().split(" ")).toList());

            Map<String, Integer> wordsCountMap = new HashMap<>();

            while (checker.ready()){
                String readLine = checker.readLine();
                String [] wordsInLine = readLine.split(" ");

                for (int i = 0; i < wordsInLine.length; i++) {
                    String currentWord = wordsInLine [i];

                    if (words.contains(currentWord)){
                        wordsCountMap.putIfAbsent(currentWord, 0);
                        wordsCountMap.put(currentWord, wordsCountMap.get(currentWord) + 1);
                    }
                }
            }

            wordsCountMap.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
