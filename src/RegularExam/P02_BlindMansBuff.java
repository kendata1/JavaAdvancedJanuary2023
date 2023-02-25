package src.RegularExam;

import java.util.Scanner;

public class P02_BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String [][] matrix = new String[rows][cols];

        int myRow = 0;
        int myCol = 0;

        for (int row = 0; row < rows; row++) {
            String [] inputArr = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
               matrix [row][col] = inputArr [col];
               if (inputArr[col].equals("B")){
                   myRow = row;
                   myCol = col;
                   matrix [row][col] = "-";
               }
            }
        }
        String command = scanner.nextLine();
        int touchedOpponents = 0;
        int moves = 0;

        while (!command.equals("Finish") && touchedOpponents < 3){
            String current = "";

            switch (command) {
                case "left":
                    if (!isOutside(myRow, myCol - 1, matrix.length, matrix[0].length)){
                        current = matrix [myRow][myCol - 1];
                        switch (current){
                            case "P":
                                touchedOpponents++;
                                moves++;
                                matrix [myRow][myCol - 1] = "-";
                                myCol = myCol - 1;
                                break;
                            case "-":
                                moves ++;
                                myCol = myCol - 1;
                            default:
                                break;
                        }
                    }
                    break;
                case "right":
                    if (!isOutside(myRow, myCol + 1, matrix.length, matrix[0].length)){
                        current = matrix [myRow][myCol + 1];
                        switch (current){
                            case "P":
                                touchedOpponents++;
                                moves++;
                                matrix [myRow][myCol + 1] = "-";
                                myCol = myCol + 1;
                                break;
                            case "-":
                                moves ++;
                                myCol = myCol + 1;
                            default:
                                break;
                        }
                    }
                    break;
                case "up":
                    if (!isOutside(myRow - 1, myCol, matrix.length, matrix[0].length)){
                        current = matrix [myRow - 1][myCol];
                        switch (current){
                            case "P":
                                touchedOpponents++;
                                moves++;
                                matrix [myRow - 1][myCol] = "-";
                                myRow = myRow - 1;
                                break;
                            case "-":
                                moves ++;
                                myRow = myRow - 1;
                            default:
                                break;
                        }
                    }
                    break;
                case "down":
                    if (!isOutside(myRow + 1, myCol, matrix.length, matrix[0].length)){
                        current = matrix [myRow + 1][myCol];
                        switch (current){
                            case "P":
                                touchedOpponents++;
                                moves++;
                                matrix [myRow + 1][myCol] = "-";
                                myRow = myRow + 1;
                                break;
                            case "-":
                                moves ++;
                                myRow = myRow + 1;
                            default:
                                break;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Game over!%nTouched opponents: %d Moves made: %d",touchedOpponents,moves);
    }
    public static boolean isOutside (int row, int col, int rowLength, int colLength) {
        return (row < 0 || col < 0 || row >= rowLength || col >= colLength);
    }
}
