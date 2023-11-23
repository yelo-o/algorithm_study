import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String form = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(form);
    }
}
