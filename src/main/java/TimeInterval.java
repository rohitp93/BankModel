import Entity.BankAccount;
import Entity.BankEvent;
import Entity.CreditCard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class TimeInterval {

public List<BankEvent> bankEventList;
public List<BankAccount> bankAccountList;

public String GetInterval(BankAccount bankAccount, String text) {

    List<BankEvent> bankEventList = bankAccount.getBankEventList();
    List<String> dateList = new ArrayList<String>();

    long diffdays = 0;

    for (BankEvent bankEvent : bankEventList) {
        if (bankEvent.getText() == text) {
            dateList.add(bankEvent.getDate());
        }
    }

    long[] diffbetweendays = new long[dateList.size() - 1];

    for (int i = 0; i < dateList.size() - 1; i++) {

        LocalDate end =  LocalDate.parse(dateList.get(i), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate start =  LocalDate.parse(dateList.get(i+1), DateTimeFormatter.ISO_LOCAL_DATE);
        diffdays = DAYS.between(start,end);
        diffbetweendays[i] = diffdays;

    }

    int biweek = 0;
    int month = 0;

    for (int i=0; i<diffbetweendays.length; i++) {

        if ((diffbetweendays[i] > 10 && diffbetweendays[i] <= 20) || (diffbetweendays[i] < -10 && diffbetweendays[i] >= -20)) {
            biweek++;
        }

        if (diffbetweendays[i] > 20 && diffbetweendays[i] <= 31 || (diffbetweendays[i] < -20 && diffbetweendays[i] >= -31)) {
            month++;
        }
    }

    if (month > biweek){
        return "Monthly expense";
    }

    if (biweek > month){
        return "Biweekly expense";
    }

    return "Random expense";
    }

}

