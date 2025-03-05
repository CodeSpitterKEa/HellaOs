public class main {
    public static void main(String[] args) {
        Car car = new Car("Bugatti" , 2005);
        Person person = new Person("Oliver" , "Ellis" , "Vinsted" , 20);
        System.out.println(car);
        System.out.println(car.startEngine());
        System.out.println(car.stopEngine());
        System.out.println(person);
    }
}
