import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class AccountTransactions {

    public List<BankAccount> bankAccountList;
    public List<CreditCard> creditCardList;
    public BankAccount bankAccount;

    public List<BankAccount> Transactions (List<BankAccount> bankAccountList) {

        List<BankAccount> toRemoveAcc = new ArrayList<BankAccount>();

        for (BankAccount bankAccount:bankAccountList) {
            List<BankEvent> bankEventList = bankAccount.getBankEventList();
            List<BankEvent> toRemoveEvent = new ArrayList<BankEvent>();

            for(BankEvent bankEvent:bankEventList) {

               if (bankEvent.getAmount() > 0) {
                   toRemoveEvent.add(bankEvent);
                }
            }

            bankEventList.removeAll(toRemoveEvent);

            if (bankEventList.size() == 0) {
                toRemoveAcc.add(bankAccount);
            }

        }

        bankAccountList.removeAll(toRemoveAcc);

        return bankAccountList;
    }

}
