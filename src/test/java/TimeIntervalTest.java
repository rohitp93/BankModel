import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TimeIntervalTest {

    TimeInterval timeInterval = new TimeInterval();
    BankAccount bankAccount = new BankAccount();

    @Test
    public void getInterval() throws Exception {

        List<BankEvent> bankEventList1 = new ArrayList<BankEvent>();

        BankEvent bankEvent1 = new BankEvent("2016-01-08","Gym","Payment","342324",-1000);
        BankEvent bankEvent2 = new BankEvent("2016-02-08","Gym","Payment","342325",-1000);
        BankEvent bankEvent3 = new BankEvent("2016-03-08","Gym","Payment","342326",-1000);
        bankEventList1.add(bankEvent1);
        bankEventList1.add(bankEvent2);
        bankEventList1.add(bankEvent3);

        BankAccount bankAccount = new BankAccount("123-456", "Rohit", bankEventList1);

        assertEquals("Monthly expense", timeInterval.GetInterval(bankAccount, "Gym"));
    }

}