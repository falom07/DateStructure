package Four.GenericsPlusIterutor.GenericWithT;

public class Exemple<T,T2>{
    T person;
    T2 car;

    public Exemple(T person, T2 car) {
        this.person = person;
        this.car = car;
    }
    public T2 takeCar(){
        return car;
    }
}
