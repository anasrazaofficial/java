package Abstraction;

public class main {
    public static void main(String[] args) {
        Bank bank = new MCB();
        bank.interestRate();
        bank.loanPeriod();
        bank.homeLoanAmount();

        bank = new Meezan();
        bank.interestRate();
        bank.loanPeriod();
        bank.homeLoanAmount();

        bank = new National();
        bank.interestRate();
        bank.loanPeriod();
        bank.homeLoanAmount();

    }
}
