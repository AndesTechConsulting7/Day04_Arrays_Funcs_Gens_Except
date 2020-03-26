package org.andestech.learning.sber2020;

public class BookStore<T extends Book> {
    private T data;

    public BookStore(T data) {
        this.setData(data);
    }

    public T getData() { return data; }

    public void setData(T data) { this.data = data;}
}
