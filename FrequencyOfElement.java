package com.bridgelabz.day6Array;

public class FrequencyOfElement {
    public static void main(String[] args) {
        //Initialize array
        int [] array = new int [] {11,2,1,3,4,5,6,3,7,8,9,4,3,25,6,9,55};
        //Array freqElement will store frequencies of element
        int [] freqElement = new int [array.length];
        int visited = -1;
        for(int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                    //To avoid counting same element again
                    freqElement[j] = visited;
                }
            }
            if(freqElement[i] != visited)
                freqElement[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println(" Element = Frequency");
        for(int i = 0; i < freqElement.length; i++){
            if(freqElement[i] != visited)
                System.out.println("    " + array[i] + "    =    " + freqElement[i]);
        }
    }
}
