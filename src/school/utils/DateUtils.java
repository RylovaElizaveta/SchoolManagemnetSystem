package school.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils{
    public static boolean isValidDate(String date){
        return date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    public static String formatDate(String raw) {
        try {
            LocalDate date = LocalDate.parse(raw);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return date.format(formatter);
        } catch (DateTimeParseException e) {
            return raw;
        }
    }
}