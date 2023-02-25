package src.StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque <Integer> indexStack = new ArrayDeque<>();

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);

            if (currentChar == '('){
                indexStack.push(index);
            }
            if (currentChar == ')'){
                int startIndex = indexStack.pop();
                String subExpression = input.substring(startIndex, index + 1);
                System.out.println(subExpression);
            }
        }
    }
}
