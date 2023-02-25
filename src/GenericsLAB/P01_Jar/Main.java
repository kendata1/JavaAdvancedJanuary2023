package src.GenericsLAB.P01_Jar;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Jar <Integer> integerJar = new Jar<>(new ArrayDeque<>());

        integerJar.add(33);
        integerJar.add(33);
        integerJar.add(33);
        integerJar.add(33);
        integerJar.add(43);

        System.out.println(integerJar.remove());
    }
}
