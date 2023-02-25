package src.StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque <String> historyStack = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (historyStack.size() <= 1){
                    System.out.println("no previous URLs");
                } else {
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                }
            } else {
                historyStack.push(input);
                System.out.println(historyStack.peek());
            }

            input = scanner.nextLine();
        }
    }
}
