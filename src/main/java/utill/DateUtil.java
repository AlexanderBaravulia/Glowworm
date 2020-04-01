package utill;


import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {

    public static void main(String[] args) {
        getTodayDate();
    }

    public static String getTodayDate(){
        LocalDate localDate = new LocalDate();
        return localDate.toString();
    }

}
