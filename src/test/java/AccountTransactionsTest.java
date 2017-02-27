import Entity.BankAccount;
import Entity.BankEvent;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AccountTransactionsTest {

    AccountTransactions accountTransactions = new AccountTransactions();
    BankAccount bankAccount = new BankAccount();
    List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
    List<BankEvent> bankEventList = new ArrayList<BankEvent>();

    @Test
    public void transactions() throws Exception {

        List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
        List<BankAccount> resultbankAccountList = new ArrayList<BankAccount>();
        List<BankEvent> bankEventList1 = new ArrayList<BankEvent>();
        List<BankEvent> bankEventList2 = new ArrayList<BankEvent>();
        List<BankEvent> bankEventList3 = new ArrayList<BankEvent>();

        BankEvent bankEvent1 = new BankEvent("2016-01-08","gym","trans","342325",18814);
        BankEvent bankEvent2 = new BankEvent("2016-02-08","gym","trans","342325",-12214);
        BankEvent bankEvent3 = new BankEvent("2016-03-08","gym","trans","342323",12374);
        bankEventList1.add(bankEvent1);
        bankEventList2.add(bankEvent2);
        bankEventList3.add(bankEvent3);

        BankAccount bankAccount1 = new BankAccount("123", "rohit1", bankEventList1);
        BankAccount bankAccount2 = new BankAccount("553", "rohit2", bankEventList2);
        BankAccount bankAccount3 = new BankAccount("883", "rohit3", bankEventList3);

        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount2);
        bankAccountList.add(bankAccount3);

        resultbankAccountList.add(bankAccount2);

        assertArrayEquals(resultbankAccountList.toArray(), accountTransactions.Transactions(bankAccountList).toArray());

    }

}