package objectOrientedProgramming.constructor;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
        System.out.println("Car created");
    }

    public String toString() {
        return model;
    }

    protected void acelerate() {
        System.out.println("Acelerando o " + this.model + " na BR a 180Km/h");
    }
}
