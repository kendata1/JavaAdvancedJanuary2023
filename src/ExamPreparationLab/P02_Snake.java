package src.ExamPreparationLab;

import java.util.Scanner;

public class P02_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sizeOfSquareMatrix = Integer.parseInt(scanner.nextLine());
        
        String [][] matrix = new String[sizeOfSquareMatrix][sizeOfSquareMatrix];

        for (int row = 0; row < sizeOfSquareMatrix; row++) {
            String oneCol = scanner.nextLine();
            for (int col = 0; col < sizeOfSquareMatrix; col++) {
                String current = oneCol.charAt(col) + "";
                matrix [row] [col] = current;
            }
        }
        int snakeRow = 0;
        int snakeCol = 0;

        for (int row = 0; row < sizeOfSquareMatrix; row++) {
            for (int col = 0; col < sizeOfSquareMatrix; col++) {
                String current = matrix[row][col];

                if (current.equals("S")){
                    snakeRow = row;
                    snakeCol = col;
                }
            }
        }
        matrix [snakeRow][snakeCol] = ".";
        int eatenFood = 0;
        boolean isInside = true;

        while (isInside && eatenFood < 10){

            String command = scanner.nextLine();

            switch (command){

                case "left":
                    if (isInsideMatrix(snakeRow, snakeCol - 1, sizeOfSquareMatrix)) {
                        snakeCol = snakeCol - 1;
                        String currentSym = matrix[snakeRow][snakeCol];
                        switch (currentSym){
                            case  "B":
                                matrix [snakeRow] [snakeCol] = ".";
                                for (int row = 0; row < sizeOfSquareMatrix; row++) {
                                    for (int col = 0; col <sizeOfSquareMatrix; col++) {
                                        String current = matrix[row][col];
                                        if (current.equals("B")){
                                            snakeRow = row;
                                            snakeCol = col;
                                            matrix [snakeRow] [snakeCol] = ".";
                                        }
                                    }
                                }
                                break;
                            case "*":
                                eatenFood++;
                                if (eatenFood >= 10) {
                                    matrix [snakeRow] [snakeCol] = "S";
                                } else {
                                    matrix[snakeRow][snakeCol] = ".";
                                }
                                break;
                            default:
                                matrix [snakeRow] [snakeCol] = ".";
                                break;
                        }
                    } else {
                        isInside = false;
                    }
                    break;

                case "right":
                    if (isInsideMatrix(snakeRow, snakeCol + 1, sizeOfSquareMatrix)) {
                        snakeCol = snakeCol + 1;
                        String currentSym = matrix[snakeRow][snakeCol];
                        switch (currentSym){
                            case  "B":
                                matrix [snakeRow] [snakeCol] = ".";
                                for (int row = 0; row < sizeOfSquareMatrix; row++) {
                                    for (int col = 0; col <sizeOfSquareMatrix; col++) {
                                        String current = matrix[row][col];
                                        if (current.equals("B")){
                                            snakeRow = row;
                                            snakeCol = col;
                                            matrix [snakeRow] [snakeCol] = ".";
                                        }
                                    }
                                }
                                break;
                            case "*":
                                eatenFood++;
                                if (eatenFood >= 10) {
                                    matrix [snakeRow] [snakeCol] = "S";
                                } else {
                                    matrix[snakeRow][snakeCol] = ".";
                                }
                                break;
                            default:
                                matrix [snakeRow] [snakeCol] = ".";
                                break;
                        }
                    } else {
                        isInside = false;
                    }
                    break;
                case "up":
                    if (isInsideMatrix(snakeRow - 1, snakeCol, sizeOfSquareMatrix)) {
                        snakeRow = snakeRow -1;
                        String currentSym = matrix[snakeRow][snakeCol];
                        switch (currentSym){
                            case  "B":
                                matrix [snakeRow] [snakeCol] = ".";
                                for (int row = 0; row < sizeOfSquareMatrix; row++) {
                                    for (int col = 0; col <sizeOfSquareMatrix; col++) {
                                        String current = matrix[row][col];
                                        if (current.equals("B")){
                                            snakeRow = row;
                                            snakeCol = col;
                                            matrix [snakeRow] [snakeCol] = ".";
                                        }
                                    }
                                }
                                break;
                            case "*":
                                eatenFood++;
                                if (eatenFood >= 10) {
                                    matrix [snakeRow] [snakeCol] = "S";
                                } else {
                                    matrix[snakeRow][snakeCol] = ".";
                                }
                                break;
                            default:
                                matrix [snakeRow] [snakeCol] = ".";
                                break;
                        }
                    } else {
                        isInside = false;
                    }
                    break;

                case "down":
                    if (isInsideMatrix(snakeRow + 1, snakeCol, sizeOfSquareMatrix)) {
                        snakeRow = snakeRow + 1;
                        String currentSym = matrix[snakeRow][snakeCol];
                        switch (currentSym){
                            case  "B":
                                matrix [snakeRow] [snakeCol] = ".";
                                for (int row = 0; row < sizeOfSquareMatrix; row++) {
                                    for (int col = 0; col <sizeOfSquareMatrix; col++) {
                                        String current = matrix[row][col];
                                        if (current.equals("B")){
                                            snakeRow = row;
                                            snakeCol = col;
                                            matrix [snakeRow] [snakeCol] = ".";
                                        }
                                    }
                                }
                                break;
                            case "*":
                                eatenFood++;
                                if (eatenFood >= 10) {
                                    matrix [snakeRow] [snakeCol] = "S";
                                } else {
                                    matrix[snakeRow][snakeCol] = ".";
                                }
                                break;
                            default:
                                matrix [snakeRow] [snakeCol] = ".";
                                break;
                        }
                    } else {
                        isInside = false;
                    }
                    break;
            }
        }

        if (isInside) {
            System.out.println("You won! You fed the snake.");
            System.out.println("Food eaten: " + eatenFood);
        } else {
            System.out.println("Game over!");
            System.out.println("Food eaten: " + eatenFood);
        }

        printMatrix(matrix);


    }


    public static boolean isInsideMatrix (int row , int col, int size) {
        boolean isInside = true;

        if (row < 0 || row >= size || col < 0 || col >= size) {
            isInside = false;
        }
        return isInside;
    }
    public static void printMatrix(String [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
