package org.andestech.learning.sber2020;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
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



    }


}
