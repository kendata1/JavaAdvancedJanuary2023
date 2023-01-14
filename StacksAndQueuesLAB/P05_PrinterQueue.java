package StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque <String> printQueue = new ArrayDeque<>();

        while (!input.equals("print")){
            if(input.equals("cancel")){
                if (printQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    String canceledDoc = printQueue.poll();
                    System.out.println("Canceled " + canceledDoc);
                }
            } else {
                printQueue.offer(input);
            }
            input = scanner.nextLine();
        }
        while (!printQueue.isEmpty()){
            System.out.println(printQueue.poll());
        }
    }
}
