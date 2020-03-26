package org.andestech.learning.sber2020;

public class GenericTest {

    static Book book1 = new RareBook(1287987, "Джек Лондон", "Белое Безмолвие",
            "978-3-16-148410-0", 1921);

    public static void main(String[] args) {

       BookStore<RareBook> book = new BookStore<>(
               new RareBook(1287987, "Джек Лондон", "Белое Безмолвие",
                        "978-3-16-148410-0", 1921));

       BookStoreExt<Book> store =
               new BookStoreExt<>(new Book[5]);
       store.setData(0,book1);
       store.setData(1,new RareBook(5409680, "Лев Толстой", "Крейцерова Соната",
               "4553-0-14-144444-2", 1901));
       store.setData(2,new RareBook(54213421, "Лев Толстой",
                "Отец Сергий",
                "4452-1-12-984544-7", 1909));

        for (Book book2: store.getData() ) {
            System.out.println(book2);
        }


    }


}
