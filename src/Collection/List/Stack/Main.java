package Collection.List.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(12);
        list.add(16);
        list.add(17);
        list.add(142);
        System.out.println(list);

        /*int i = 0 ;
        while(!list.isEmpty()){
            System.out.println(list.pop());
            if(i == 2){
                list.add(123);
            }
            i++;
        }
        System.out.println(list);*/

        System.out.println(list.peek());
        System.out.println(list.get(2));
    }

}
