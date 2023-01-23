package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(rows, cols, matrix, scanner);

        String commands = scanner.nextLine();

        while (!commands.equals("END")) {
            String[] commandArr = commands.split(" ");
            if (!commandArr[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else if (commandArr.length > 5) {
                System.out.println("Invalid input!");
            } else if (!areValidCoordinates(commandArr,rows,cols)){
                System.out.println("Invalid input!");
            } else {
                int firstIndex = Integer.parseInt(commandArr[1]);
                int secondIndex = Integer.parseInt(commandArr[2]);
                int thirdIndex = Integer.parseInt(commandArr[3]);
                int fourthIndex = Integer.parseInt(commandArr[4]);

                String toSwap = matrix [firstIndex][secondIndex];

                matrix [firstIndex][secondIndex] = matrix [thirdIndex][fourthIndex];
                matrix [thirdIndex] [fourthIndex] = toSwap;

                printMatrix(matrix);
            }

            commands = scanner.nextLine();
        }

    }

    public static void fillMatrix(int rows, int cols, String[][] matrix, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = data[j];
            }
        }
    }

    public static boolean areValidCoordinates(String[] coordinates, int rows, int cols) {
        boolean areValid = true;
        for (int i = 1; i < coordinates.length; i++) {
            try {
                int currentCoordinate = Integer.parseInt(coordinates[i]);
                if (i % 2 == 1) {
                    if (currentCoordinate < 0 || currentCoordinate >= rows) {
                        areValid = false;
                    }
                } else {
                    if (currentCoordinate < 0 || currentCoordinate >= cols){
                        areValid = false;
                    }
                }
            } catch (Exception e) {
                areValid = false;
            }
        }
        return areValid;
    }
    public static void printMatrix(String [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
