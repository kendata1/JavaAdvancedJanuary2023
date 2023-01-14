package StacksAndQueuesLAB;

import java.util.*;
import java.util.stream.Collector;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] expressionArr = input.split("\\s+");
        List <String> expressionList = new ArrayList<>();
        Collections.addAll(expressionList,expressionArr);

        ArrayDeque<String> numStack = new ArrayDeque<>(expressionList);
        while (numStack.size() > 1) {
            int firstNum = Integer.parseInt(numStack.pop());
            String operator = numStack.pop();
            int secondNum = Integer.parseInt(numStack.pop());

            int result = 0;
            if (operator.equals("+")){
                result = firstNum + secondNum;
            } else  if (operator.equals("-")){
                result = firstNum - secondNum;
            }
            numStack.push("" + result);
        }
        System.out.println(numStack.pop());
    }
}
