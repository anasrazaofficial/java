public class Bank {
    Double amount = 00.00;

    public void deposit(Integer paise) {
        this.amount = this.amount + paise;
        System.out.println("Cash deposit=" + paise);
    }

    public void withdraw(Integer paise) {
        this.amount = this.amount - paise;
        System.out.println("Cash withdraw=" + paise);
    }

    public void checkBalance() {
        System.out.println("Your balance" + this.amount);
    }
}
