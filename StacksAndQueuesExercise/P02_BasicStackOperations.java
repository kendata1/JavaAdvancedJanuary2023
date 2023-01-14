package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] commandsArr = scanner.nextLine().split("\\s+");
        String [] numbersArr = scanner.nextLine().split("\\s+");

        int numbersToPush = Integer.parseInt(commandsArr[0]);
        int numbersToPop = Integer.parseInt(commandsArr[1]);
        String numberToCheck = commandsArr[2];

        ArrayDeque <String> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            stack.push(numbersArr[i]);
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }

        int smallestNum = Integer.MAX_VALUE;
        if (stack.isEmpty()){
            System.out.println("0");
        } else {
            if (stack.contains(numberToCheck)) {
                System.out.println("true");
            } else {
                while (!stack.isEmpty()){
                    int currentNum = Integer.parseInt(stack.pop());
                    if (currentNum < smallestNum){
                        smallestNum = currentNum;
                    }
                }
                System.out.println(smallestNum);
            }
        }
    }
}
