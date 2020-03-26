package org.andestech.learning.sber2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {

    private static void printColl(List list)
    {
        for (Object o: list) System.out.print(o + ", ");
        System.out.println("\b\b.");
    }

    public static void main(String[] args) {

        int a = 123;
        Integer a2 = a;

        Byte b = 122;
        Boolean b2 = true;

        List list1;
        list1 = new ArrayList();
        list1.add(123);
        list1.add("Sklsdfjlskfj");
        list1.add(GenericTest.book1);

        for (Object o: list1 ) System.out.println(o);

        List<Integer> arrList = new ArrayList<>(10);
        arrList.addAll(Arrays.asList(new Integer[]{1,2,-200,3,23,-4,8,34}));
        printColl(arrList);





    }


}
