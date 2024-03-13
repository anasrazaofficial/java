package enCapsulation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bank bank = new bank();

        bank.deposite(100);
        bank.withDraw(111);
        bank.withDraw(11);
        bank.withDraw(111);
        bank.withDraw(111);
        bank.deposite(100);
    }
}
