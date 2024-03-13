package Abstraction;

public class MCB extends Bank {
    @Override
    public void interestRate() {
        System.out.println("2%");

    }
    
    @Override
    public void loanPeriod() {
        System.out.println("2 years");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("10M");
    }
}
