package Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        cat cat = new cat();

        //Over load
        cat.run();
        cat.run("world");

        //Over ride
        cat.voice();

        //Up Cast
        Bank bank = null;
        Scanner scanner = new Scanner(System.in);
        String bankName = scanner.next();
        if (bankName.equalsIgnoreCase("meezan")) {
            bank = new meezan();
        } else if (bankName.equalsIgnoreCase("AlHabib")) {
            bank = new AlHabib();
        } else if (bankName.equalsIgnoreCase("National")) {
            bank = new National();
        } else {
            System.out.println("No bank found");
        }

        if (bank != null) {
            bank.interestRate();
            bank.loanPeriod();
            bank.maxPersonalLoan();
            bank.homeLoanAmount();
        }


    }
}
