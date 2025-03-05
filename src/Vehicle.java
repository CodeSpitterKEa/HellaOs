public class Vehicle {
    private String licensePlate;
    private String brand;
    private int year;
    private int mileage;

    public Vehicle(String licensePlate, String brand, int year, int mileage) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;

    }
    public void drive(int km) {
        mileage += km;

    }
//get
    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void printInfo() {
        System.out.println("LicensePlate is: " + getLicensePlate() + getYear() + getBrand() + getMileage());
    }
}

