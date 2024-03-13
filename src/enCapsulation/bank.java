package enCapsulation;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class bank {
    private Integer amount = 0;
    private String status = "ACTIVE";
    private Integer warn = 0;

    public void deposite(Integer amount) {
        if (this.status == "ACTIVE") {
            this.amount = amount;
            getAmount();
        } else {
            System.out.println("Your account is now " + status);
        }
    }

    public void withDraw(Integer wdAmt) {
        if (warn < 2) {
            if (wdAmt < amount && status.equalsIgnoreCase("ACTIVE")) {
                this.amount -= wdAmt;
                System.out.print("Your current amount is ");
                getAmount();
            } else {
                System.out.println("Insufficient amount");
                warn++;
            }
        } else {
            this.status = "INACTIVE";

        }
    }


    public void getAmount() {
        System.out.println(amount);
    }
}
