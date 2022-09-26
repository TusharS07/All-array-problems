package com.bridgelabz.day6Array;

public class EvenPositionArray {
    static int[] array = {0,1,2,3,4,5,6,7,8,9,10,12};
    public static void main(String[] args) {
        System.out.println("origanl array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //print only array present on an even position
        System.out.println("print only even postion array ");
        for (int i = 0; i < array.length; i=i+2) {
            System.out.println(array[i]);
        }

    }
}
