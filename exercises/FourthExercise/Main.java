package exercises.FourthExercise;

public class Main {
    public static void main(String[] args) {
        Manager firstManager = new Manager("Daniel", 5000, 1500);
        System.out.println("Salário total de " + firstManager.name + ": " + firstManager.calculateTotalSalary());
    }
}
