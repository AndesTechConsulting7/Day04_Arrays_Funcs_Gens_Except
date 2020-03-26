package org.andestech.learning.sber2020;

import sun.security.util.Length;

public class BookStoreExt<T extends Book> {
    private T[] data;

    public BookStoreExt(T[] data) {
        //this.setData(data);
        this.data = data;
    }

    public T[] getData() { return data; }

    private boolean checkLength(){
         return data.length!=0;
    }

    public void setData(T[] data) {
        if(checkLength()) this.data = data;
    }

    public void setData(int i, T dataOne) {
        if(!checkLength()) return;
        if(i<0 || i>= data.length) return;
        this.data[i] = dataOne;}
}
