package src.GenericsLAB.P04_ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> integers = new ArrayList<>();
        Collections.addAll(integers,6,8,78,8,6,4,-12);

        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(integers));
    }
}
