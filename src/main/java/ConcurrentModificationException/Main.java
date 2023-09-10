package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        for (Integer integer : integers) {
            integers.add(29); //Concurrent modification in arraylist integers
        }

        //SOLUTIONS::
        /* USING ITERATOR */
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            int integer = iterator.next();
            System.out.println(integer);
            if (!iterator.hasNext()) {
                integers.add(12);
                integers.remove(2);
                integers.set(2, 22);
                System.out.println(integers.get(2));
                break;
            }

        }
        System.out.println(integers);

        //CopyOnWriteArrayList collection
        CopyOnWriteArrayList<Integer> integerCopyOnWriteArrayList = new CopyOnWriteArrayList<>();
        integerCopyOnWriteArrayList.add(1);
        integerCopyOnWriteArrayList.add(2);
        integerCopyOnWriteArrayList.add(3);
        for (Integer integer : integerCopyOnWriteArrayList) {
            if (integer == 2) integerCopyOnWriteArrayList.add(911);
            if (integer == 3) integerCopyOnWriteArrayList.add(100);
            if (integer == 1) integerCopyOnWriteArrayList.remove(2);

            if (integer == 3) integerCopyOnWriteArrayList.set(0, 11);

        }
        System.out.println(integerCopyOnWriteArrayList);


        /* NOT MODIFYING INSIDE LOOP */
        List<Integer> toRemove = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer == 3) {

                toRemove.add(integer);

            }
        }
        integers.removeAll(toRemove);
        System.out.println(integers);


    }
}