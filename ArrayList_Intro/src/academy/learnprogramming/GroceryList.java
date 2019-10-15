package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your Grocery List.");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);

        // returns -1 if item not found
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;

    }
}
