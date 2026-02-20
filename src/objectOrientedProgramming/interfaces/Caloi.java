package objectOrientedProgramming.interfaces;

public class Caloi implements Bike {

    @Override
    public void acelerateBike() {
        System.out.println("Acelerando a Caloi na trilha!");
    }

    @Override
    public void brakeBike() {
        System.out.println("Freando a Caloi na trilha!");
    }

    @Override
    public void stopBike() {
        System.out.println("Parando a Caloi na trilha!");
    }
}
