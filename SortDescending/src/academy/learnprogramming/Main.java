package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    // Step 1 - Instantiate Scanner to record User Input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 3 - Call getIntegers() and print results
        int[] scannerArray = getIntegers(10);

        int[] sortedArray = sortDescending(scannerArray);

        printSortedArray(sortedArray);

    }

    // Step 2 - Create method to accept integers and return array of length=number
    public static int[] getIntegers(int number){
        // Prompt user for terminal input
        System.out.println("Please enter " + number + " integer values.\r");

        // Instantiate array of length = number
        int[] values = new int[number];

        // Create for loop to read scanner.nextInt() and add to array
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        // Return array of values of length = number
        return values;
    }

    public static void printSortedArray(int[] sortedArray) {
        for(int i=0; i<sortedArray.length; i++) {
            System.out.println("Element " + i + " equals " + sortedArray[i]);
        }
    }

    public static int[] sortDescending(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        for(int i=0; i<unsortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] =sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


}
