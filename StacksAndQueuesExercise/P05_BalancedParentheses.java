package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque <Character> openBracketsStack = new ArrayDeque<>();
        boolean isBalanced = false;

        for (char bracket : input.toCharArray()) {

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openBracketsStack.push(bracket);
            }

            if (bracket == ')' || bracket == ']' || bracket == '}'){

                if (openBracketsStack.isEmpty()){
                    isBalanced = false;
                    break;
                }

                char lastOpenBracket = openBracketsStack.pop();

                if (lastOpenBracket == '(' && bracket == ')'){
                    isBalanced = true;

                } else if (lastOpenBracket == '[' && bracket == ']'){
                    isBalanced = true;

                } else if (lastOpenBracket == '{' && bracket == '}' ){
                    isBalanced = true;

                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
