package objectOrientedProgramming.interfaces;

public class Human extends LivingBeing {
    public Human(){
        super(42);
    }

    @Override
    public void breathe() {
        System.out.println(this.age);
        System.out.println("Inalando e exalando Co2!");        
    }
    
}
