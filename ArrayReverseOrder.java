package com.bridgelabz.day6Array;

public class ArrayReverseOrder {
    static int[] array = {2,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        System.out.println("array elements in original order");
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //print in reverce order
        System.out.println("array elements in reverce order");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
