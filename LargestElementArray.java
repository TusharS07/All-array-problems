package com.bridgelabz.day6Array;
import java.util.Scanner;
public class LargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len; //declare array length
        System.out.println("enter array size ");
        len =sc.nextInt(); //create object of length variable
        int[] array = new int[len];
        System.out.println("enter array elements "); //get use inpute array elemnts one by one using for loop
        for (int i = 0; i < len; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("elements in array"); //print all elements
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        //declare max with first element of array
        int max = array[0];
        //start loop through the array for campare ements with max
        //tra
        for (int i = 1; i < array.length; i++) {
            //campare elements with max
            //using if for campare
            //Traverse array elements from second and
            //compare every element with current max
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("largest element of array is " +max);
    }
}
