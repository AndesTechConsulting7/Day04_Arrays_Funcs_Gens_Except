package org.andestech.learning.sber2020;

public class GenericTest {

    public static void main(String[] args) {

        BookStore<RareBook> book = new BookStore<>(
                new RareBook(1287987, "Джек Лондон", "Белое Безмолвие",
                        "978-3-16-148410-0", 1921));



    }


}
