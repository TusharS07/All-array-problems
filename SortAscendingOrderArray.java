package com.bridgelabz.day6Array;

public class SortAscendingOrderArray {
    static int[] array = {8,6,9,44,56,2,3,89};

    public static void main(String[] args) {
        int temp = 0;
        System.out.println("Display origan array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //sort array in asending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println(); // for next line

        //display sorted array
        System.out.println("elements of array sort in ascending order ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
