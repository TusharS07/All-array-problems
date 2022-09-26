package com.bridgelabz.day6Array;
import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.println("enter the length of array ");
        len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("enter elements of array ");
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("array elements ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //for compare
        int min = array[0];
        //travser loop for compare
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("smallest number of array is " +min);
    }



}
