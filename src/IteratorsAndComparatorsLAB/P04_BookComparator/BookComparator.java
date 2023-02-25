package src.IteratorsAndComparatorsLAB.P04_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());

        if (result != 0){
            return result;
        } else {
            return o1.getYear() - o2.getYear();
        }
    }
}
