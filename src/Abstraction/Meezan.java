package Abstraction;

public class Meezan extends Bank{

    @Override
    public void interestRate() {
        System.out.println("3%");
    }

    @Override
    public void loanPeriod() {
        System.out.println("1 years");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("9M");
    }
}
