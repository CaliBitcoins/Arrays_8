package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Bangkok");
        addInOrder(placesToVisit, "Hungary");
        addInOrder(placesToVisit, "Latvia");
        addInOrder(placesToVisit, "Australia");
        addInOrder(placesToVisit, "Romania");
        addInOrder(placesToVisit, "Czech Republic");
        addInOrder(placesToVisit, "Sweden");
        addInOrder(placesToVisit, "Colombia");
        addInOrder(placesToVisit, "Brazil");
        addInOrder(placesToVisit, "Sweden");
        printList(placesToVisit);

        // Inserting entry @ index causes reassignment of all subsequent elementes to n+1 address
        placesToVisit.add(1, "Poland");
        placesToVisit.add(1, "Belarus");
        placesToVisit.add(1,"Russia");
        placesToVisit.add(1, "Australia");
        placesToVisit.add(1, "Illinois");
        placesToVisit.add(1, "Arkansas");
        printList((placesToVisit));

        // Removing elements works exactly the same way
        placesToVisit.remove("Illinois");
        printList((placesToVisit));
        placesToVisit.remove(1); // No longer fucking girls in Arkansas
        printList((placesToVisit));

    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now fucking girls in " + i.next());
        }
        System.out.println("_-___-_-_-_____---_-__--___--_____--___-___-");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newDestination) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newDestination);
            if(comparison == 0) {
                // Equality means duplicate Destination
                System.out.println("You are already fucking in " + newDestination);
                return false;
            } else if(comparison > 0) {
                // newDestination should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newDestination);
                return true;
            } else if(comparison < 0) {
                // move on to next destination and fuck girls
            }
        }

        stringListIterator.add(newDestination);
        return true;
    }
}
