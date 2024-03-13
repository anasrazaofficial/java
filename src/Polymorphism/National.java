package Polymorphism;

public class National extends Bank{
    @Override
    public void interestRate() {
        System.out.println("No Interest");
    }

    @Override
    public void loanPeriod() {
        System.out.println("2 Years");
    }

    @Override
    public void maxPersonalLoan() {
        System.out.println("70K");
    }

    @Override
    public void homeLoanAmount() {
        System.out.println("15M");
    }
}
