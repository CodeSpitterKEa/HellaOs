public class Car1 extends Vehicle {

        private String fuelType;

        public Car1(String licensePlate, String brand, int year, int mileage, String fuelType) {
            super(licensePlate, brand, year, mileage);
            this.fuelType=fuelType;
        }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public void printInfo() {
        System.out.println(getLicensePlate() + getBrand() + getYear() + getMileage() + getFuelType());

    }
}

