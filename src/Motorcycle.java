public class Motorcycle extends Vehicle {

    private int engineSize;

    public Motorcycle(String licensePlate, String brand, int year, int mileage) {
        super(licensePlate, brand, year, mileage);
        this.engineSize = engineSize;

    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
        if (engineSize < 0) {
            System.out.println("Your engine has to be bigger than 0");
        }
    }
    @Override
    public void printInfo() {
        System.out.println(getLicensePlate() + getBrand() + getYear() + getMileage());

    }
}
