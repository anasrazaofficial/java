package Abstraction;

public class National extends Bank{
    @Override
    public void interestRate() {
        System.out.println("5%");
    }

    @Override
    public void loanPeriod() {
        System.out.println("5 years");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("7M");
    }
}
