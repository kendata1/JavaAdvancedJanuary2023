package MultidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(num);
                num++;
            }
        }
        String commands = scanner.nextLine();

        while (!commands.equals("Nuke it from orbit")) {
            String[] commandsArr = commands.split("\\s+");
            int xCoordinate = Integer.parseInt(commandsArr[0]);
            int yCoordinate = Integer.parseInt(commandsArr[1]);
            int power = Integer.parseInt(commandsArr[2]);

            for (int currentRow = xCoordinate - power; currentRow <= xCoordinate + power; currentRow++) {
                if (isInMatrix(currentRow, yCoordinate, matrix)) {
                    matrix.get(currentRow).set(yCoordinate, 0);
                }
            }

            for (int currentCol = yCoordinate + power; currentCol >= yCoordinate - power; currentCol--) {
                if (isInMatrix(xCoordinate, currentCol, matrix)) {
                    matrix.get(xCoordinate).set(currentCol, 0);
                }
            }

            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    int currentNum = matrix.get(i).get(j);

                    if (currentNum == 0){
                        matrix.get(i).remove(j);
                        j--;
                    }
                }
            }

            matrix.removeIf(List::isEmpty);

            commands = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}


