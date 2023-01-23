package MultidimensionalArraysLAB;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char [][] firstMatrix = new char [rows][cols];
        char [][] secondMatrix = new char[rows][cols];
        fillMatrix(rows,cols,firstMatrix,scanner);
        fillMatrix(rows,cols,secondMatrix,scanner);

        char [][] resultMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]){
                    resultMatrix [i][j] = firstMatrix[i][j];
                } else {
                    resultMatrix [i][j] = '*';
                }
            }
        }
        printMatrix(rows,cols,resultMatrix);
    }



    public static void fillMatrix (int rows , int cols, char [][] matrix,Scanner scanner){

        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = data[j].charAt(0);
            }
        }
    }
    public static void printMatrix (int rows, int cols, char [][] matrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
