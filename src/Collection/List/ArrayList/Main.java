package Collection.List.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(12);
        list.add("Ji");
        String word = (String) list.get(1);
        System.out.println(word);
        System.out.println(list.get(0));


    }
}

