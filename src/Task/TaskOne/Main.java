package Task.TaskOne;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> listOfNumber = new HashMap<>();

        enterNumber(listOfNumber);

    }
    public static <T,T1>void seeAllList(Map<T,T1> list){
        for(Map.Entry<T,T1> enter : list.entrySet()){
            System.out.println(enter.getKey() + ") " + enter.getValue());
        }
    }
    public static  void enterNumber(Map<Integer,String> map){
        System.out.println("Введите гос номер: ");
        Scanner scanner = new Scanner(System.in);
        int key = 1;
        while(true){
            String number = scanner.nextLine();
            if(number.equals("СТОП")){
                break;
            }else if(number.equals("СПИСОК")){
                seeAllList(map);
            }
            map.put(key,number);
            ++key;
        }
    }
}
