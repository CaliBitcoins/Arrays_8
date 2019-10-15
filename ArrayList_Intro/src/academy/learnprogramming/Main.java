package academy.learnprogramming;

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
        System.out.println("Please enter the grocery item to modify: ");
        int listMod = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String itemMod = scanner.nextLine();
        groceryList.modifyGroceryItem(listMod-1, itemMod);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int removeItem = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(removeItem-1);
    }

    public static void searchForItem() {
        System.out.println("Please enter the item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println("Item not found.");
        }


    }
}
