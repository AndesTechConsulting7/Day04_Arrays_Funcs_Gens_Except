package org.andestech.learning.sber2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayTest {

    public static void reverseArray2(int[] arr)
    {
        int N =arr.length, temp;

        for (int i = 0; i < N>>1 ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }


    /**
     * Устаревший метод, не эффективный!
     * @param arr
     * @deprecated
     */
    @Deprecated
    public static void reverseArray(int[] arr)
    {
        int N =arr.length;
        int[] rev = new int[N];
        for (int i = 0; i < N ; i++) {
            rev[i] = arr[arr.length - i -1];
        }
        System.arraycopy(rev,0,arr,0,N);
    }

    public static String[] generatePasswords(int Lpass, int Npass)
    { String[] passwords = new String[Npass];
        for (int i = 0; i < Npass ; i++) passwords[i] = generatePassword(Lpass);
        return passwords;
    }

    private static String generatePassword(int N)
    { StringBuilder sb = new StringBuilder();
      int min=33, max=126, np= max-min;
        for (int i = 0; i < N; i++) {
            int code = 33 + new Random().nextInt(np);
            sb.append( (char)code );
        }
        return sb.toString();
    }

    //-------------------------------
    public static void echo(String s, int N)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) sb.append(s);
        System.out.println(sb.toString());

    }

    public static void echo() { echo("-", 70);}

    public static int[] generateRandomArray(int N, int range)
    {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Random().nextInt(range) - range/2;
        }

        return arr;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("[");
        if(arr.length==0) {System.out.println("]"); return;}
        for (int i = 0; i < arr.length ; i++) {System.out.printf("%d,",arr[i]);}
        System.out.println("\b]");
    }

    public static int summa2(int[] vars){
        int sum = 0;
        for(int i=0; i< vars.length; i++) sum += vars[i];
        return sum;
    }

    public static int summa(int[] vars){
        int sum = 0;
        for(int d: vars) sum+=d;
        return sum;
    }

    public static int summ(int ... vars){
        int sum = 0;
        for(int d: vars) sum+=d;
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -4, -500, 55, 20, -2, -8, 21};
        int[] arr0 = {}; // empty array
        int[] arr2 = new int[12];
        int arr21[] = new int[12];
        int[][] arr3 = new int[2][6];
        int[][] arr4 = {{1, 2, 3}, {4, -55, 9}, {2, 0, 1}, {-22, 3, 4}, {5, 5, 88}};

        //1. Обход массива
        printArray(arr);
        printArray(arr0);

        System.out.println("summ1=" + summ(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("summ2=" + summa(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

        //---------------
        int[] rarr1 = generateRandomArray(10, 100);
        int[] rarr2 = generateRandomArray(10, 100);
        echo();
        printArray(rarr1);
        printArray(rarr2);
        echo("+", 60);
        for (int i = 0; i < 10; i++) System.out.println(generatePassword(15));

        String[] pass = generatePasswords(8, 5);
        echo();
        System.out.println(Arrays.toString(pass));
        // sort
        echo();
        printArray(arr);
        Arrays.sort(arr); printArray(arr);
        reverseArray2(arr); printArray(arr);
        echo();
     // convert to gen Array
     Integer[] arrI = Arrays.stream(arr).boxed().toArray(Integer[]::new);

     Arrays.sort(arrI, new Comparator(){
          @Override
          public int compare(Object o1, Object o2) {
              return (int)o2 - (int)o1;
          }
      });

      Arrays.sort(arrI, (x,y)->x-y);
      //Convert from get to int array
      int[] arr7 = Arrays.stream(arrI).mapToInt( (Integer x)->x.intValue()).toArray();


    }

}