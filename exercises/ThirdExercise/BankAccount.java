package exercises.ThirdExercise;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Depósito realizado: " + value);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void withdraw(double value) {
        if (value < 0) {
            System.out.println("Saldo indisponivel");
        } else {
            balance -= value;
            System.out.println("Saque realizado: " + value);
        }
    }

    protected double getBalance() {
        return balance;
    }

    private void setAccountNumber(String number) {
        this.accountNumber = number;
    }
}
