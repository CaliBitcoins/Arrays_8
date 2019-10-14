package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    // Instantiate new Scanner to take in user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instantiate new array to accept 5 integers from Scanner
        int[] myIntegers = getIntegers(5);
        int min = findMinimum(myIntegers);
        System.out.println("The minimum value entered was: " + min);
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

    public static int findMinimum(int[] array) {
        int check = array[0];
        for(int i=0; i<array.length; i++) {
            if(check > array[i]) {
                check = array[i];
            }
        }
        return check;
    }
}
