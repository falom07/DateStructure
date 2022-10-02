package Four.Comporator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer []listOfInteger =new Integer[]{1123,4,62323,34,3,12};
        Arrays.sort(listOfInteger);

        //int number = Arrays.binarySearch(listOfInteger,4);
        //System.out.println(number);

        System.out.println(Arrays.toString(listOfInteger));

        Arrays.sort(listOfInteger,Comparator.reverseOrder());
        System.out.println(Arrays.toString(listOfInteger));

        Workers carr1 = new Workers(+1234234, "Vika", 23);
        Workers carr2 = new Workers(+37373737, "Alina", 89);
        Workers carr3 = new Workers(+1649, "Antion", 67);
        Workers carr4 = new Workers(+5535, "Vika", 5);
        Workers carr6 = new Workers(+37373737, "Matasha", 88);
        Workers carr7 = new Workers(+4567, "Koal", 3);

        List<Workers> list = new ArrayList<>();
        list.add(carr1);
        list.add(carr2);
        list.add(carr3);
        list.add(carr4);
        list.add(carr6);
        list.add(carr7);

       // Collections.sort(list, new Comparator<Workers>()
        list.sort(new Comparator<Workers>() {
                    @Override
                    public int compare(Workers o1, Workers o2) {

                        int number = o1.number.compareTo(o2.number);
                        if(number != 0){
                            return number;
                        }
                        int age =  o1.age.compareTo(o2.age);
                        if(age != 0){
                            return age;
                        }
                        int name = o1.name.compareTo(o2.name);
                        return name;
                    }
                }
        );
    }
}
