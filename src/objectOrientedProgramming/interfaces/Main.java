// Learned interfaces, abstract classes, inheritance, polymorphism and error handling
package objectOrientedProgramming.interfaces;

public class Main {
    public static void main(String[] args) {
        // Car myCar = new Sandero();
        // Car myCar1 = new Mobi();
        Car myBrokenCar = null;

        LivingBeing myBeing = new Human();
        myBeing.breathe();

        // for(int i = 0; i < 11; i++) myCar.acelerate();

        try {
            myBrokenCar.acelerate();
        } catch (NullPointerException exception) {
            System.out.println("Vendendo carro quebrado");
        }

    }
}
