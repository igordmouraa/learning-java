// Learned classes, constructors, methods and objects
package objectOrientedProgramming.constructor;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Corsa");
        Car myCar1 = new Car("Vectra");

        Bike myBike = new Bike("Caloi");

        myCar.acelerate();
        myCar1.acelerate();

        myBike.acelerateBike();
    }
}
