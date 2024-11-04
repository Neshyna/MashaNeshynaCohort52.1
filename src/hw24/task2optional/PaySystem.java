package hw24.task2optional;

import hw24.task2.PaymentSystem;

public interface PaySystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    void transferMoney(double amount, PaymentSystem recipient); // (перевод средств на другой счет)

    String getCurrency();
    String getTitle();
}
