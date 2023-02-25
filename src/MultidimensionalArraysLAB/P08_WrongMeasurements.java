package src.MultidimensionalArraysLAB;

import java.util.Scanner;

public class P08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int [][] oldMatrix = new int [rows][];

        fillMatrix(rows,oldMatrix,scanner);

        int [][] newMatrix = new int [rows][oldMatrix[0].length];

        String [] wrongValueCoordinates = scanner.nextLine().split("\\s+");
        int x = Integer.parseInt(wrongValueCoordinates[0]);
        int y = Integer.parseInt(wrongValueCoordinates[1]);

        int wrongNum = oldMatrix [x][y];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < oldMatrix[i].length; j++) {
                int currentNum = oldMatrix[i][j];

                if (currentNum == wrongNum){
                    int up = 0;
                    int down = 0;
                    int left = 0;
                    int right = 0;
                    int sum = 0;

                    if (i != 0){
                        up = oldMatrix [i-1][j];
                    }
                    if (i != oldMatrix.length - 1){
                        down = oldMatrix [i + 1][j];
                    }
                    if (j != 0){
                        left = oldMatrix [i][j-1];
                    }
                    if (j != oldMatrix[i].length - 1){
                        right = oldMatrix [i][j+1];
                    }
                    if (up != wrongNum){
                        sum += up;
                    }
                    if (down != wrongNum){
                        sum += down;
                    }
                    if (left != wrongNum){
                        sum += left;
                    }
                    if (right != wrongNum){
                        sum += right;
                    }
                    currentNum = sum;
                }
                newMatrix [i][j] = currentNum;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }



    }
    public static void fillMatrix (int rows , int [][] matrix,Scanner scanner){
        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(" ");
            matrix [i] = new int[data.length];
            for (int j = 0; j < data.length; j++) {
                matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
    }
}
