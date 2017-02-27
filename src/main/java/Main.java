import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Balance balance = new Balance();
        TimeInterval timeInterval = new TimeInterval();
        AccountTransactions accountTransactions = new AccountTransactions();

        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        List<CreditCard> creditCards = new ArrayList<CreditCard>();

        List<BankEvent> bankEventListJonas = new ArrayList<BankEvent>();
        List<BankEvent> bankEventListTony = new ArrayList<BankEvent>();
        List<BankEvent> bankEventListMark = new ArrayList<BankEvent>();

        List<BankEvent> creditEventListJonas = new ArrayList<BankEvent>();

        BankEvent bankEvent1 = new BankEvent("2016-08-01","Gym","Payment","123-456",-200);
        BankEvent bankEvent2 = new BankEvent("2016-07-23","Video streaming","Transaction"," ",-99);
        BankEvent bankEvent3 = new BankEvent("2016-07-18","Gym","Payment","123-456",-200);
        BankEvent bankEvent4 = new BankEvent("2016-07-04","Gym","Payment","123-456",-200);
        BankEvent bankEvent5 = new BankEvent("2016-06-28","Gym","Payment","123-456",-50);
        BankEvent bankEvent6 = new BankEvent("2016-06-25","Salary","Transaction"," ",1337);
        BankEvent bankEvent7 = new BankEvent("2016-06-22","Video streaming","Transaction"," ",-99);
        BankEvent bankEvent8 = new BankEvent("2016-06-20","Gym","Payment","123-456",-200);
        BankEvent bankEvent9 = new BankEvent("2016-05-23","Video streaming","Transaction"," ",-99);

        bankEventListJonas.add(bankEvent1);
        bankEventListJonas.add(bankEvent2);
        bankEventListJonas.add(bankEvent3);
        bankEventListJonas.add(bankEvent4);
        bankEventListJonas.add(bankEvent5);
        bankEventListJonas.add(bankEvent6);
        bankEventListJonas.add(bankEvent7);
        bankEventListJonas.add(bankEvent8);
        bankEventListJonas.add(bankEvent9);

        bankEventListTony.add(bankEvent6);
        bankEventListTony.add(bankEvent6);
        bankEventListTony.add(bankEvent6);

        bankEventListMark.add(bankEvent1);
        bankEventListMark.add(bankEvent2);
        bankEventListMark.add(bankEvent3);
        bankEventListMark.add(bankEvent6);


        BankEvent creditEvent1 = new BankEvent("2016­08­01","Pizza","Credit card transaction",70);
        BankEvent creditEvent2 = new BankEvent("2016­07­25","Bar","Credit card transaction",120);
        BankEvent creditEvent3 = new BankEvent("2016­07­20","Grocery Store","Credit card transaction",99);

        creditEventListJonas.add(creditEvent1);
        creditEventListJonas.add(creditEvent2);
        creditEventListJonas.add(creditEvent3);

        BankAccount bankAccount1 = new BankAccount("10201", "Jonas", bankEventListJonas);
        BankAccount bankAccount2 = new BankAccount("12232", "Tony", bankEventListTony);
        BankAccount bankAccount3 = new BankAccount("12232", "Mark", bankEventListMark);

        CreditCard creditCard = new CreditCard("****_****_****-1234","Jonas",creditEventListJonas);

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);

        creditCards.add(creditCard);

        System.out.println("Balance of Jonas Bank Account is " + balance.BalanceAcc(bankAccount1));
        System.out.println("Balance of Tony Bank Account is " + balance.BalanceAcc(bankAccount2));
        System.out.println("Balance of Mark Bank Account is " + balance.BalanceAcc(bankAccount3));
        System.out.println("Balance of Jonas Credit Card is " + balance.BalanceCredit(creditCard));
        System.out.println("Jonas : Gym payments are a " + timeInterval.GetInterval(bankAccount1,"Gym"));

        List<BankAccount> resultList = accountTransactions.Transactions(bankAccounts);

        for(BankAccount bankAccount:resultList) {
            System.out.println(bankAccount.getOwner() + " has at least one negative transaction" + " and these are the events :");

            List<BankEvent> bankEventList = bankAccount.getBankEventList();

            for(BankEvent bankEvent:bankEventList) {
                System.out.println(bankEvent.getDate() + " " + bankEvent.getText() + " " + bankEvent.getBankEventType() + " " + bankEvent.getAmount());

            }
        }



    }
}
