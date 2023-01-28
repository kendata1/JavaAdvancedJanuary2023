package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] inputArr = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(inputArr[0]);
        int cols = Integer.parseInt(inputArr[1]);
        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String [] rowNumbersArr = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = Integer.parseInt(rowNumbersArr[j]);
            }
        }
        int row = rows - 1;
        int col = cols - 1;

        while (row != -1){
            int r = row;
            int c = col;
            while (c < cols && r >= 0){
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;
            if(col == -1){
                col = 0;
                row--;
            }
        }
    }
}
