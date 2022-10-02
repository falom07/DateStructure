package Four.GenericsPlusIterutor.GenericWithT;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        CarSecomd carFirst = new CarSecomd();
        CarFirst carSecond = new CarFirst();

        Exemple<Person, InterfaceForCar> car = new Exemple<>(person,carSecond);
        car.takeCar().go();
    }
}
