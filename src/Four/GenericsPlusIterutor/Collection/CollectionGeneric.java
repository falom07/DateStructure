package Four.GenericsPlusIterutor.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionGeneric {
    public static void main(String[] args) {
        List list = new ArrayList(); // Object

        list.add("our words");
        list.add(1);
        EmptyForExample object = new EmptyForExample();
        list.add(object);

        String words = (String) list.get(0); //To String
        System.out.println(list.get(0));
        System.out.println(words);

        System.out.println("=====================");

        /*List <String> list2 = new ArrayList<>();
        list2.add("your words");
        //list2.add(8);

        String word = list2.get(0);
        System.out.println(list2.get(0));
        System.out.println(word);*/




    }

    public static class EmptyForExample {

    }
}
