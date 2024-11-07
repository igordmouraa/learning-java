package objectOrientedProgramming.interfaces;

public abstract class LivingBeing {
    protected int age;

    public LivingBeing(int age){
        this.age = age;
    }

    public abstract void breathe();

    public void sleep(){
        System.out.println("Sleeping....");
    }
}
