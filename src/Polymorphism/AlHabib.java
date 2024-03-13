package Polymorphism;

public class AlHabib extends Bank {

    @Override
    public void interestRate() {
        System.out.println("7%");
    }

    @Override
    public void loanPeriod() {
        System.out.println("3 Years");
    }

    @Override
    public void maxPersonalLoan() {
        System.out.println("50K");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("5M");
    }
}
