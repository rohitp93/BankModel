package Entity;


import java.util.List;

public class CreditCard {

    public String number;
    public String nameoncard;
    public List<BankEvent> creditCardEventList;

    public CreditCard() {

    }

    public CreditCard(String number, String nameoncard, List<BankEvent> creditCardEventList) {
        this.number = number;
        this.nameoncard = nameoncard;
        this.creditCardEventList = creditCardEventList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameoncard() {
        return nameoncard;
    }

    public void setNameoncard(String nameoncard) {
        this.nameoncard = nameoncard;
    }

    public List<BankEvent> getCreditCardEventList() {
        return creditCardEventList;
    }

    public void setCreditCardEventList(List<BankEvent> creditCardEventList) {
        this.creditCardEventList = creditCardEventList;
    }
}
