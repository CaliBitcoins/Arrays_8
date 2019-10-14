package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    // Instantiate new Scanner to take in user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instantiate new array to accept 5 integers from Scanner
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average of the input values is: " + getAverage(myIntegers));

    }

    // returns int[] and number is length of array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;

    }
}
