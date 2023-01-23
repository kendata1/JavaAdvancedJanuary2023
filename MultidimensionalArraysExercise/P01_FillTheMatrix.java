package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String type = input[1];
        int [][] matrix = new int[n][n];


        if (type.equals("A")){
            fillMethodA(n,matrix);
        } else if (type.equals("B")){
            fillMethodB(n,matrix);
        }

        printMatrix(matrix);


    }
    public static void fillMethodA (int n, int [][] matrix) {
        int currentNum = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix [row][col] = currentNum;
                currentNum ++;
            }
        }
    }
    public static void fillMethodB (int n, int [][] matrix) {
        int currentNum = 0;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 1){
                for (int row = n - 1; row >= 0; row --) {
                    currentNum ++;
                    matrix [row][col] = currentNum;
                }
            } else {
            for (int row = 0; row < n; row++) {
                currentNum ++;
                matrix [row][col] = currentNum;
                }
            }
        }
    }
    public static void printMatrix (int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
