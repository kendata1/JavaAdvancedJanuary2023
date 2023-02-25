package src.StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> historyStack = new ArrayDeque<>();
        ArrayDeque <String> forwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyStack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardStack.addFirst(historyStack.pop());
                    System.out.println(historyStack.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardStack.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    historyStack.push(forwardStack.peek());
                    System.out.println(forwardStack.poll());
                }
            } else {
                historyStack.push(input);
                System.out.println(historyStack.peek());
                forwardStack.clear();
            }

            input = scanner.nextLine();
        }
    }
}
