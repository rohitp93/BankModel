import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class Balance {

    public List<BankAccount> bankAccountList;
    public List<CreditCard> creditCardList;

    public float BalanceAcc (BankAccount bankAccount) {
        float balance = 0;
        List<BankEvent> bankEventList = bankAccount.getBankEventList();

        for (BankEvent bankEvent:bankEventList) {
            balance += bankEvent.getAmount();
        }

        return balance;
    }

    public float BalanceCredit (CreditCard creditCard) {
        float balance = 0;
        List<BankEvent> creditCardEventList = creditCard.getCreditCardEventList();

        for (BankEvent creditCardEvent:creditCardEventList) {
            balance += creditCardEvent.getAmount();
        }

        return balance;
    }

}
