public class Registry {
    private Vehicle[] array;
    private int count;

    public Registry(int maxVehicles) {
        array = new Vehicle[maxVehicles];

    }

    public void addVehicle(Vehicle v) {
        if (count < array.length) {
            array[count] = v;
            count += +1;
        }
    }

    public void listVehicles() {

        for (int i = 0; i < array.length; i++) {
            if (array[i]==null) {
                return;
            }
            this.array[i].printInfo();
        }

    }
}



