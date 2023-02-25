package src.StreamsFilesAndDirectoriesLAB;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P02_WriteToFile {
    public static void main(String[] args) {


    String basePath = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
    String inputPath = basePath + "\\input.txt";
    String outputPath = basePath + "\\output.txt";

    List <Character> ignoreSymbols = new ArrayList<>();
    Collections.addAll(ignoreSymbols,',','.','!','?');

    try (InputStream in = new FileInputStream(inputPath); OutputStream out = new FileOutputStream(outputPath)) {
        int oneByte = in.read();

        while (oneByte >= 0){
            if (!ignoreSymbols.contains((char)oneByte)){
                out.write(oneByte);
            }

            oneByte = in.read();
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
