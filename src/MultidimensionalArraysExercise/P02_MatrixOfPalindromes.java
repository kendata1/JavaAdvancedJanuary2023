package src.MultidimensionalArraysExercise;

import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        char start = 97;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String currentString = start + String.valueOf((char) (97 + col + row)) + (start);
                matrix[row][col] = currentString;
            }
            start++;
        }
        printMatrix(matrix);
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

