public class Carr {
    Integer number;
    String name;
    Integer age;


    public Carr(Integer nuumber, String name, Integer age) {
        this.number = nuumber;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "number " + number + " name " + name + " age " + age + "\n";
    }
}
