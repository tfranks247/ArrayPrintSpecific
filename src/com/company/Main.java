package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] array1;

        array1 = new int[] {2,5,9,0,2,1,8,5,4};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 5) { // i = 0 goes through the loop and has 1 added to  it every time
                System.out.println(i); // array[i] starts at position 0 in the Array "array[0]. Every time it goes through the loop Array it will move to the next slot "array[2]" array [5]
            }
        }
    }
}

//Create an array with the following values: [2,5,9,0,2,1,8,5,4]
// Loop through the array and print out the index each time the value equals 5.