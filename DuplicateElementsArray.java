package com.bridgelabz.day6Array;

public class DuplicateElementsArray {
    static int[] array = {2,3,6,8,9,2,4,6,8};

    public static void main(String[] args) {
        System.out.println("elements in array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //show only duplicate elements of array
        System.out.println("duplicate elements of an array ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++ ) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
