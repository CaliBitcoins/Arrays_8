package academy.learnprogramming;

import java.util.Scanner;

public class Main {


    // Step 1 - Instantiate Scanner to record User Input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 3 - Call getIntegers() and print results
        int[] scannerArray = getIntegers(10);
        for(int i=0; i<scannerArray.length; i++){
            System.out.println("Element " + i +", input value was " + scannerArray[i]);
        }

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
}
