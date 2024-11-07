// Learned interfaces, abstract classes, inheritance and polymorphism
package objectOrientedProgramming.interfaces;

public class Sandero implements Car {

    final int speedLimit = 100;

    public int actualSpeed = 0;

    @Override
    public void acelerate() {
        if (this.actualSpeed < this.speedLimit) {
            this.actualSpeed += 10;
            System.out.println("Acelerando");
        }
        System.out.println("Velocidade atual: " + actualSpeed);
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

}
