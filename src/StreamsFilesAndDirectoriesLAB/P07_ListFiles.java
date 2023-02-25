package src.StreamsFilesAndDirectoriesLAB;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {

        String path = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()){
                File [] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()){
                        System.out.printf("%s: [%d]%n",f.getName(), f.length());
                    }
                }
            }
        }
    }
}
