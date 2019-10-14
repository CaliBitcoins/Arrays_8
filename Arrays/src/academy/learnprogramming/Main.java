package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Array of 10 Integers
        int[] myIntArray = new int[10];

        // Stores an int value of 50 @ the 6th position of the Array
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        // Explicitly assign Array values
        int[] explicitArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(explicitArray[0]);

        // For loop to populate Array
        int[] forArray = new int[200000000];
        for(int i = 0; i<= 2000; i++) {
            forArray[i] = i*12;
            System.out.println(forArray[i]);
        }

        // For loop to populate Array with .length method
        int[] lenArray = new int[20000];
        for(int i = 0; i < lenArray.length; i++) {
            lenArray[i] = i*450;
            System.out.println("Value at index " + i + " is " + lenArray[i]);
        }


    }

    public static void printArray(int[] array) {
        
    }
}
