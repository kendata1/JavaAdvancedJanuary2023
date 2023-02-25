package src.StreamsFilesAndDirectoriesLAB;

import java.io.*;

public class P09_SerializeCustomObject {
    public static void main(String[] args) {

         class Cube implements Serializable {
             String color;
             double width;
             double height;
             double depth;
         }

         Cube cube = new Cube();
         cube.color = "green";
         cube.width = 15.3d;
         cube.height = 12.4d;
         cube.depth = 3d;

         String path = "C:\\Users\\DEEPCOOL\\Documents\\JavaAdvancedJanuary2023\\resoures\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\save_P09.ser";

         try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

             oos.writeObject(cube);

         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
