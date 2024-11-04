package hw24.task2;

public interface PaymentSystem {

    void withdrawMoney(double amount); // (снятие со счета) - списываются деньги со счета
    void depositTransfer(double amount); // (поступление денег на счет);
    double checkBalance(); // (остаток на счете).

    Object getCurrency();

    Object getTitle();
}
