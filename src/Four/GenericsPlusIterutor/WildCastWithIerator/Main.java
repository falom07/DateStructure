package Four.GenericsPlusIterutor.WildCastWithIerator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Car");
        listOfString.add("Bike");
        listOfString.add("Motobike");

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(23);
        listOfInteger.add(1);
        listOfInteger.add(345234);

        iterators(listOfInteger);
        iterators(listOfString);

    }
    public static void iterators(List<?>list){ //Wildcast
        Iterator <?>iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n=====================\n");
    }
}
