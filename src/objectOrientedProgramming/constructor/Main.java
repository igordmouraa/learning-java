// Learned classes, constructors, methods and objects
package objectOrientedProgramming.constructor;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Corsa");
        Car myCar1 = new Car("Vectra");

        myCar.acelerate();
        myCar1.acelerate();
    }
}

class Car {
    String model;

    public Car(String model) {
        this.model = model;
        System.out.println("Car created");
    }

    public String toString() {
        return model;
    }
    
    public void acelerate(){
        System.out.println("Acelerando o " + this.model + " na BR a 180Km/h");
    }
}
