package src.StreamsFilesAndDirectoriesLAB;

import java.io.*;

public class P03_CopyBytes {
    public static void main(String[] args) {

        String basePath = "C:C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\P03_output.txt";

        try (InputStream inputStream = new FileInputStream(inputPath); OutputStream outputStream = new FileOutputStream(outputPath)) {

            int oneByte = inputStream.read();

            while (oneByte >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    outputStream.write(oneByte);
                } else {
                    String oneSymbolCode = String.valueOf(oneByte);
                    for (int i = 0; i < oneSymbolCode.length(); i++) {
                        char currentSym = oneSymbolCode.charAt(i);
                        outputStream.write(currentSym);
                    }
                }
                oneByte = inputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
