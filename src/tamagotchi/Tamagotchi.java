package tamagotchi;

public class Tamagotchi {
    private String name;
    private int age;
    private String mood;
    private int energy;


    //constructor
    public Tamagotchi(int age, String name, String mood, int energy) {
        this.age=age;
        this.energy=energy;
        this.mood=mood;
        this.name=name;


    }
    // Global methods
    public String activity() {
        if(getEnergy()<0) {
            return getName() + " is tired";


        }
        else {
            energy -= 3;
            return "Activity";
        }

    }

    public String feed() {
        energy += 1;
        return getName() + " Steals a cow from the local ranch... ";
    }
    public String sleep() {
        energy += 2;
        return getName() + " Is sleeping and has replenished ";

    }




    //Set


    public void setName(String name) {
        this.name = name;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // get


    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public int getEnergy() {
        return energy;
    }

    public int getAge() {
        return age;
    }
}
