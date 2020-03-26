package org.andestech.learning.sber2020;

public class BookStoreExt<T extends Book> {
    private T[] data;

    public BookStoreExt(T[] data) {
        this.setData(data);
    }

    public T[] getData() { return data; }

    public void setData(T[] data) { this.data = data;}
    public void setData(int i, T dataOne) {
        if(i<0 || i>= data.length) return;
        this.data[i] = dataOne;}
}
