package src.GenericsLAB.P02_GenericsArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator <T> {


   public static <T> T [] create(Class <T> tClass, int length, T item){
        T [] array = (T[]) Array.newInstance(tClass,length);
       for (int i = 0; i < length; i++) {
           array [i] = item;
       }
       return array;
    }
}
