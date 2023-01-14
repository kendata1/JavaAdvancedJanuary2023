package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] numbersArr = input.split("\\s+");
        ArrayDeque <String> numbersStack = new ArrayDeque<>();
        for (String num: numbersArr) {
            numbersStack.push(num);
        }
        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");
        }
    }
}
