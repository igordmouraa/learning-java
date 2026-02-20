package objectOrientedProgramming.constructor;

public class Bike {
    String model;

    public Bike(String model) {
        this.model = model;
        System.out.println("Bike created!");
    }

    public String toString(){
        return model;
    }


    public void acelerateBike() { System.out.println("Acelerando a " + this.model + "na trilha!"); };
}