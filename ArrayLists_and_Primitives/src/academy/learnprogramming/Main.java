package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Josh");

        // ERROR type argument cannot be of primitive type
        // ArrayList<int> intArrayList = new ArrayList<int>();
        // SO HOW DO WE CREATE AN ArrayList containing ints?
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));


        // AUTOBOXING - FROM PRIMITIVE TO OBJECT AND BACK USING WRAPPER CLASSES
        Integer integer = new Integer(69);
        Double dblD = new Double(12.25);
        // Populate ARRAYLIST
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i*21300));
        }
        // TO OUTPUT MUST CONVERT FROM WRAPPER BACK TO PRIMITIVE --> .intValue()
        for(int i=0; i<=10; i++) {
            System.out.println(intArrayList.get(i).intValue());
        }

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.00002) {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        // IN ENGLISH - from ArrayList myDoubleValues get value at index i and convert to type double
        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(value + " @ index " + i);
        }
    }
}
