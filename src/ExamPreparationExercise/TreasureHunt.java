package src.ExamPreparationExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputDimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(inputDimensions[0]);
        int cols = Integer.parseInt(inputDimensions[1]);

        String [][] matrix = new String [rows][cols];

        for (int row = 0; row < rows; row++) {
            String [] inputArr = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                String currentSym = inputArr[col];
                matrix[row][col] = currentSym;
            }
        }

        int myRow = 0;
        int myCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String current = matrix[i][j];

                if (current.equals("Y")){
                    myRow = i;
                    myCol = j;
                }
            }
        }

        List <String> stepsList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            switch (command){
                case "left":
                    if (isInside(matrix, myRow, myCol - 1)){
                        if (!matrix [myRow][myCol - 1].equals("T")){
                            myCol = myCol - 1;
                            stepsList.add("left");
                        }
                    }
                    break;
                case "right":
                    if (isInside(matrix, myRow, myCol + 1)){
                        if (!matrix [myRow][myCol + 1].equals("T")){
                            myCol = myCol + 1;
                            stepsList.add("right");
                        }
                    }
                    break;
                case "up":
                    if (isInside(matrix, myRow - 1, myCol)){
                        if (!matrix [myRow - 1][myCol].equals("T")){
                            myRow = myRow - 1;
                            stepsList.add("up");
                        }
                    }
                    break;
                case "down":
                    if (isInside(matrix, myRow + 1, myCol)){
                        if (!matrix [myRow + 1][myCol].equals("T")){
                            myRow = myRow + 1;
                            stepsList.add("down");
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (matrix[myRow][myCol].equals("X")){
            System.out.println("I've found the treasure!");
            System.out.println("The right path is " + stepsList.toString().replaceAll("[\\[\\]]", ""));
        } else {
            System.out.println("The map is fake!");
        }

    }
    public static boolean isInside (String [][] matrix, int row, int col){
        boolean isInside = true;

        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix [0].length) {
            isInside = false;
        }
        return isInside;
    }
}
