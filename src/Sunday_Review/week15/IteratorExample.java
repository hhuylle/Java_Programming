package Sunday_Review.week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        // Mini task : remove all the elements less than 5
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,2,6,4,8,3,5,7,2,1,6,2,5,5));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() < 5 ){
                it.remove();
            }
        }

        System.out.println(list); // [6, 8, 5, 7, 6, 5, 5]

    }
}
