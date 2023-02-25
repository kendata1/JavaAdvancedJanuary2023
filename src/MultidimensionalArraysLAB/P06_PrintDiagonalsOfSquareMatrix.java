package src.MultidimensionalArraysLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = rows;

        int [][] matrix = new int[rows][cols];

        fillMatrix(rows,cols,matrix,scanner);
        ArrayDeque<Integer> firstDiagonal = new ArrayDeque<>();
        ArrayDeque<Integer> secondDiagonal = new ArrayDeque<>();

        for (int i = 0; i < matrix.length; i++) {
            firstDiagonal.offer(matrix[i][i]);
            }

        for (int i = matrix.length - 1; i >= 0; i--) {
            int j = Math.abs(i - (matrix.length - 1));
                secondDiagonal.offer(matrix[i][j]);
            }
        while (!firstDiagonal.isEmpty()){
            System.out.print(firstDiagonal.poll() + " ");
        }
        System.out.println();
        while (!secondDiagonal.isEmpty()){
            System.out.print(secondDiagonal.poll() + " ");
        }
    }


    public static void fillMatrix (int rows , int cols, int [][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
    }
}
