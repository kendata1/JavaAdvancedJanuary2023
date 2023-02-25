package src.StreamsFilesAndDirectoriesLAB;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class P08_NestedFolders {
    public static void main(String[] args) {

        String path = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        System.out.println(root.getName());

        int count = 1;
        while (!dirs.isEmpty()){
            File current = dirs.poll();
            File [] nestedFiles = current.listFiles();

            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()){
                    dirs.offer(nestedFile);
                    count ++;
                    System.out.println(nestedFile.getName());
                }
            }
        }
        System.out.println(count + " folders");
    }
}
