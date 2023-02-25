package src.MultidimensionalArraysExercise;

import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        fillMatrix(size, size, matrix, scanner);

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                if (rows == cols) {
                    firstDiagonalSum += matrix[rows][cols];
                }
            }
        }
        int col = 0;
        for (int rows = matrix.length - 1; rows >= 0; rows--) {
            secondDiagonalSum += matrix[rows][col];
            col++;
        }
        int difference = Math.abs(firstDiagonalSum - secondDiagonalSum);
        System.out.println(difference);
    }


    public static void fillMatrix(int rows, int cols, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(data[j]);
            }
        }
    }
}
