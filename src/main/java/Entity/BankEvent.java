package Entity;

public class BankEvent {

    public String date;
    public String text;
    public String bankEventType;
    public String recipient;
    public float amount;

    public BankEvent() {
    }

    public BankEvent(String date, String text, String bankEventType, String recipient, float amount) {
        this.date = date;
        this.text = text;
        this.bankEventType = bankEventType;
        this.recipient = recipient;
        this.amount = amount;
    }

    public BankEvent(String date, String text, String bankEventType, float amount) {
        this.date = date;
        this.text = text;
        this.bankEventType = bankEventType;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBankEventType() {
        return bankEventType;
    }

    public void setBankEventType(String bankEventType) {
        this.bankEventType = bankEventType;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
