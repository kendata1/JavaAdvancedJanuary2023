package src.MultidimensionalArraysLAB;

import java.util.Scanner;

public class P05_MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int [][] matrix = new int[rows][cols];

        fillMatrix(rows,cols,matrix,scanner);
        int biggestSum = Integer.MIN_VALUE;
        int [][] subMatrix = new int[2][2];

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int a = matrix[i][j];
                int b = matrix[i][j+1];
                int c = matrix[i+1][j];
                int d = matrix[i+1][j+1];
                int sum = a+b+c+d;

                if (sum > biggestSum){
                    biggestSum = sum;
                    subMatrix[0][0] = matrix[i][j];
                    subMatrix[0][1] = matrix[i][j+1];
                    subMatrix[1][0] = matrix[i+1][j];
                    subMatrix[1][1] = matrix[i+1][j+1];
                }
            }
        }
        printMatrix(2,2,subMatrix);
        System.out.println(biggestSum);
    }
    public static void fillMatrix (int rows , int cols, int [][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
    }
    public static void printMatrix (int rows, int cols, int [][] matrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
