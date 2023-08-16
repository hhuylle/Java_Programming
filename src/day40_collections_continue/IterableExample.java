package day40_collections_continue;

import java.beans.beancontext.BeanContext;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));
/*
        for (Integer each : list) {
            if (each<5){
                list.remove(each);
            }
        }

 */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)< 5){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){ // while loop is prefer to use
            Integer each = it.next();
            if (each < 5){
                it.remove();
            }
        }

        System.out.println(list2);
        // [5, 5, 6, 7, 5, 6, 7]

        System.out.println("----------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();) {
            Integer each = i.next();
            if (each<5){
                i.remove();
            }
        }
        System.out.println(list3);
        // [5, 5, 6, 7, 5, 6, 7]

        System.out.println("----------------------------------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list4.removeIf(each -> each < 5); // removeIf() method is the best option to use to remove the element with the conditions

        System.out.println(list4);
        // [5, 5, 6, 7, 5, 6, 7]

        System.out.println("----------------------------------------------");

        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        list5.removeIf( p -> p < 5 );

        System.out.println(list5);
        // [5, 5, 6, 7, 5, 6, 7]


    }
}
