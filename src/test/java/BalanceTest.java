import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BalanceTest {

    Balance balance = new Balance();

    BankAccount bankAccount = new BankAccount();
    CreditCard creditCard = new CreditCard();

    @Test
    public void balanceAcc() throws Exception {

        List<BankEvent> bankEventList1 = new ArrayList<BankEvent>();

        BankEvent bankEvent1 = new BankEvent("2016-01-08","Salary","Transaction","342325",18814);
        BankEvent bankEvent2 = new BankEvent("2016-02-08","Gym","Payment","342325",-12214);
        BankEvent bankEvent3 = new BankEvent("2016-03-08","Salary","Transaction","342323",12374);
        bankEventList1.add(bankEvent1);
        bankEventList1.add(bankEvent2);
        bankEventList1.add(bankEvent3);

        BankAccount bankAccount = new BankAccount("123", "rohit", bankEventList1);

        assertEquals(18974,balance.BalanceAcc(bankAccount), 0);

    }

    @Test
    public void balanceCredit() throws Exception {

        List<BankEvent> bankEventList2 = new ArrayList<BankEvent>();

        BankEvent bankEvent1 = new BankEvent("2016-01-08","Food","Payment",300);
        BankEvent bankEvent2 = new BankEvent("2016-02-08","Bar","Payment",200);
        BankEvent bankEvent3 = new BankEvent("2016-03-08","Movie Tickets","Payment",400);
        bankEventList2.add(bankEvent1);
        bankEventList2.add(bankEvent2);
        bankEventList2.add(bankEvent3);

        CreditCard creditCard = new CreditCard("123****123","rohitcard",bankEventList2);

        assertEquals(900,balance.BalanceCredit(creditCard), 0);



    }

}