package Entity;

import java.util.List;

public class BankAccount {

    public String number;
    public String owner;
    public List<BankEvent> bankEventList;

    public BankAccount() {
    }

    public BankAccount(String number, String owner, List<BankEvent> bankEventList) {
        this.number = number;
        this.owner = owner;
        this.bankEventList = bankEventList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<BankEvent> getBankEventList() {
        return bankEventList;
    }

    public void setBankEventList(List<BankEvent> bankEventList) {
        this.bankEventList = bankEventList;
    }
}
