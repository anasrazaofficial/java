package Polymorphism;

public class meezan extends Bank{
    @Override
    public void interestRate() {
        System.out.println("3%");
    }

    @Override
    public void loanPeriod() {
        System.out.println("5 Years");
    }

    @Override
    public void maxPersonalLoan() {
        System.out.println("25K");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("7M");
    }
}
