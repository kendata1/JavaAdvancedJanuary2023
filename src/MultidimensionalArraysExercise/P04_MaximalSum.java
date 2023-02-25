package src.MultidimensionalArraysExercise;

import java.util.Scanner;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int [][] matrix = new int[rows][cols];

        fillMatrix(rows,cols,matrix,scanner);

        int biggestSum = Integer.MIN_VALUE;
        int [][] biggestSubMatrix = new int[3][3];

        for (int row = 0; row <= rows - 3; row++) {
            for (int col = 0; col <= cols - 3; col++) {
                int [] [] subMatrix = new int[3][3];
                int sumOfSubMatrixElements = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        subMatrix [i][j] = matrix [row + i][col + j];
                    }
                }
                for (int i = 0; i < subMatrix.length; i++) {
                    for (int j = 0; j < subMatrix.length; j++) {
                        int currentNum = subMatrix [i][j];
                        sumOfSubMatrixElements += currentNum;
                    }
                }
                if (sumOfSubMatrixElements > biggestSum){
                    biggestSum = sumOfSubMatrixElements;
                    biggestSubMatrix = subMatrix;
                }
            }
        }
        System.out.println("Sum = " + biggestSum);
        printMatrix(biggestSubMatrix);


    }
    public static void fillMatrix (int rows , int cols, int [][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
    }
    public static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
