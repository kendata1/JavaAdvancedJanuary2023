package src.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commandArr = scanner.nextLine().split("\\s+");
        String[] numbersArr = scanner.nextLine().split("\\s+");

        ArrayDeque<String> queue = new ArrayDeque<>();

        int numbersToOffer = Integer.parseInt(commandArr[0]);
        int numbersToPoll = Integer.parseInt(commandArr[1]);
        String numberToCheck = commandArr[2];

        for (int i = 0; i < numbersToOffer; i++) {
            queue.offer(numbersArr[i]);
        }
        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        int smallest = Integer.MAX_VALUE;

        if (queue.isEmpty()) {
            System.out.println("0");
        } else {
            if (queue.contains(numberToCheck)) {
                System.out.println("true");
            } else {
                while (!queue.isEmpty()) {
                    int currentNum = Integer.parseInt(queue.poll());
                    if (currentNum < smallest){
                        smallest = currentNum;
                    }
                }
                System.out.println(smallest);
            }
        }
    }
}
