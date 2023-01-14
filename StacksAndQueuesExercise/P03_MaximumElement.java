package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String [] commandArr = scanner.nextLine().split("\\s+");

            switch (commandArr[0]) {
                case "1":
                stack.push(Integer.parseInt(commandArr[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int biggestNum = Integer.MIN_VALUE;
                    ArrayDeque <Integer> stackToFindMax = new ArrayDeque<>(stack);
                    while (!stackToFindMax.isEmpty()){
                        int currentNum = stackToFindMax.pop();
                        if (currentNum > biggestNum) {
                            biggestNum = currentNum;
                        }
                    }
                    System.out.println(biggestNum);
                    break;
            }
        }
    }
}
