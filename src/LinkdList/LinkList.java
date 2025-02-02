package LinkdList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList   {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Sorting the list in ascending order
        Collections.sort(cars);

        // Printing the sorted list
        System.out.println(cars);
    }
}
