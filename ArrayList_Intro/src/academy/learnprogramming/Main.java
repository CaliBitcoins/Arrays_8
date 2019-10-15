package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice of options");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify and item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Please enter the grocery item name to modify: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name to remove: ");
        String removeItem = scanner.nextLine();
        groceryList.removeGroceryItem(removeItem);
    }

    public static void searchForItem() {
        System.out.println("Please enter the item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println("Item not found.");
        }

        public static void processArrayList() {
            // THREE WAYS OF RETURNING CONTENTS OF GROCERY LIST USING ARRAY
            // 1 - Creates a new array and copies existing array to new array
            //ArrayList<String> newArray = new ArrayList<String>();
            //newArray.addAll(groceryList.getGroceryList());


            // 2 - works the same as above
            ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

            // 3 - Initialize a list to size of GroceryList ArrayList
            // Take contents of ArrayList and copies them to new List
            //String[] myArray = new String[groceryList.getGroceryList().size()];
            //myArray = groceryList.getGroceryList().toArray(myArray);
        }

    }
}
