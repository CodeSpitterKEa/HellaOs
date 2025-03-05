public class MainVehicles {
    public static void main(String[] args) {
        Registry registry = new Registry(5);
        Car1 car = new Car1("Baller" , "Ferrari" , 2000 , 10000 , "Benzin");
        Motorcycle motorcycle = new Motorcycle("aayo", "Yamaha" , 2010 , 15000);
        registry.addVehicle(car);
        registry.addVehicle(motorcycle);
        registry.listVehicles();
    }
}
