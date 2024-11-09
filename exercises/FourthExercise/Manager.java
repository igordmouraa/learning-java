package exercises.FourthExercise;

public class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return salary + bonus;
    }
}
