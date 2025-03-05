public class Car {
    String brand;
    int year;


    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;


    }


    public String toString() {

        return ("Your brand is: " + brand + " And your year is: " + year);

    }
    public String startEngine() {
        return ("The engine starts...");

    }
    public String stopEngine() {
        return ("The engine stops...");

    }
}
