package src.StreamsFilesAndDirectoriesLAB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P06_output.txt";

        Path inPath = Paths.get(inputPath);
        Path outPath = Paths.get(outputPath);

        List<String> lines = Files.readAllLines(inPath);
        lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
        Collections.sort(lines);

        Files.write(outPath, lines);
    }
}
