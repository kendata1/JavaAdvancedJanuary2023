package src.StacksAndQueuesLAB;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] kidsArr = scanner.nextLine().split("\\s+");
        int step = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();

        Collections.addAll(queue, kidsArr);
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < step; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle ++;
        }
        System.out.println("Last is " + queue.poll());
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
