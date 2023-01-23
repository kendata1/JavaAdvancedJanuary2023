package MultidimensionalArraysLAB;

import java.util.Scanner;

public class P01_CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstMatrixDimensionsArr = scanner.nextLine().split(" ");
        int firstRows = Integer.parseInt(firstMatrixDimensionsArr[0]);
        int firstCols = Integer.parseInt(firstMatrixDimensionsArr[1]);

        int [][] firstMatrix = new int[firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String [] elements = scanner.nextLine().split(" ");
            for (int j = 0; j < firstCols; j++) {
                firstMatrix [i][j] = Integer.parseInt(elements[j]);
            }
        }
        String [] secondMatrixDimensionsArr = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(secondMatrixDimensionsArr[0]);
        int secondCols = Integer.parseInt(secondMatrixDimensionsArr[1]);

        if (firstRows != secondRows || firstCols != secondCols){
            System.out.println("not equal");
            return;
        }

        int [][] secondMatrix = new int[secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String [] elements = scanner.nextLine().split(" ");
            for (int j = 0; j < secondCols; j++) {
                secondMatrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        for (int i = 0; i < secondRows; i++) {
            for (int j = 0; j < secondCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
