package src.MultidimensionalArraysLAB;

import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensionsArr = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensionsArr[0]);
        int cols = Integer.parseInt(dimensionsArr[1]);

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String [] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
               matrix [i][j] = Integer.parseInt(data[j]);
            }
        }
        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentNum = matrix[i][j];

                if (currentNum == searchedNumber){
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
