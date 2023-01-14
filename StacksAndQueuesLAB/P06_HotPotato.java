package StacksAndQueuesLAB;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] kidsArr = scanner.nextLine().split("\\s+");
        int step = Integer.parseInt(scanner.nextLine());

        ArrayDeque <String> queue = new ArrayDeque<>();

        Collections.addAll(queue,kidsArr);

        while (queue.size() > 1){
            for (int i = 1; i < step; i++) {
                queue.offer(queue.poll());
            }
                System.out.println("Removed " + queue.poll());
            }
            System.out.println("Last is " + queue.poll());
    }
}
