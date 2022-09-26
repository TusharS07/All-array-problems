package com.bridgelabz.day6Array;

public class OddPositionArray {
    static String[] array = {"Tushar", "Yash", "Sai", "Aniket", "Shubham", "Ashwini" };

    public static void main(String[] args) {
        //orignal array print
        System.out.println("This is orignal array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //display only odd postion array
        System.out.println("print only odd postion array");
        for (int i = 1; i < array.length; i=i+2) {
            System.out.println(array[i]);
        }

    }

}
