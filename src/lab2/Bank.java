package lab2;
interface BankAccountInterface {
    void deposit(double amount);   // пополнение
    void withdraw(double amount);  // снятие
    double getBalance();           // баланс
}
class BankAccount implements BankAccountInterface {
    private double balance;
    // создание нового счета
    public BankAccount(double initialBalance) { this.balance = initialBalance; }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: +" + amount);
        } else {
            System.out.println("Ошибка: сумма должна быть положительной");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount);
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма");
        }
    }
    @Override
    public double getBalance() { return balance; }
}
