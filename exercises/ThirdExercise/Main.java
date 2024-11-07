package exercises.ThirdExercise;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1", 0.0);
        myAccount.deposit(100);
        myAccount.withdraw(50.5);
        System.out.println("Saldo atual: " + myAccount.getBalance());
    }
}
