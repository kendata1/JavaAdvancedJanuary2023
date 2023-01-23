package MultidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int degrees = Integer.parseInt(command.split("[()]+")[1]) % 360;

        List<String> wordsList = new ArrayList<>();

        String input = scanner.nextLine();
        int longest = 0;

        while (!input.equals("END")){
            int currentLength = input.length();
            if (currentLength > longest){
                longest = currentLength;
            }
            wordsList.add(input);
            input = scanner.nextLine();
        }
        int rows = wordsList.size();
        int cols = longest;

        char [][] wordsMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String word = wordsList.get(row);
            for (int col = 0; col < cols; col++) {
                char currentChar = ' ';
                if (col < word.length()){
                    currentChar = word.charAt(col);
                }
                wordsMatrix [row][col] = currentChar;
            }
        }
        rotateAndPrint(degrees,wordsMatrix,rows,cols);
    }
    public static void rotateAndPrint (int degrees, char [][] matrix, int rows, int cols){
        if (degrees == 90){
            char [][] newMatrix = new char[cols][rows];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                newMatrix[col][rows-1 - row] = matrix[row][col];
                }
            }
            printMatrix(newMatrix);

        }else if (degrees == 180){
            char [][] newMatrix = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    newMatrix[rows - 1 - row][cols - 1 - col] = matrix[row][col];
                }
            }
            printMatrix(newMatrix);

        }else if (degrees == 270){
            char [][] newMatrix = new char[cols][rows];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    newMatrix[cols - 1 - col][row] = matrix[row][col];
                }
            }
            printMatrix(newMatrix);

        } else {
            printMatrix(matrix);
        }
    }
    public static void printMatrix(char [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
