package org.andestech.learning.sber2020;

public class Main {


    public static void printArray(int[] arr)
    {
        System.out.print("[");
        if(arr.length==0) {System.out.println("]"); return;}
        for (int i = 0; i < arr.length ; i++) {System.out.printf("%d,",arr[i]);}
        System.out.println("\b]");
    }

    public static int summa(int[] vars){

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,-4,-500,55,20};
        int[] arr0 = {}; // empty array
        int[] arr2 = new int[12];
        int arr21[] = new int[12];
        int[][] arr3 = new int[2][6];
        int[][] arr4 = {{1,2,3},{4,-55,9},{2,0,1},{-22,3,4},{5,5,88}};

        //1. Обход массива
        printArray(arr);
        printArray(arr0);


     }
}
