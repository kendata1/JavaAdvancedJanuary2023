package src.MultidimensionalArraysLAB;

import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensionsArr = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensionsArr[0]);
        int cols = Integer.parseInt(dimensionsArr[1]);

        int [][] matrix = new int[rows][cols];
        fillMatrix(rows,cols,matrix,scanner);
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.printf("%d%n%d%n%d",rows,cols,sum);
    }
    public static void fillMatrix (int rows , int cols, int [][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
    }
}
