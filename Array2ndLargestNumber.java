package com.bridgelabz.day6Array;

public class Array2ndLargestNumber {
    static int[] array = {5,6,4,90,2,86,32,1,10,50};

    public static void main(String[] args) {
        int temp;
        System.out.println("array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();//for empty line

        //sort array
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //after sorting array
        //find 2nd largest array and print
        System.out.println("2nd Largest Number in an Array " +array[array.length-2]);
        }

    }
