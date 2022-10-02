package Four.Comporator;

public class Workers {
    Integer number;
    String name;
    Integer age;


    public Workers(Integer nuumber, String name, Integer age) {
        this.number = nuumber;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "\nnumber " + number + " name " + name + " age " + age + "";
    }
}