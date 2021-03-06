
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Zadanie17 {
    static void zadanie17() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        LocalDate myDateNow = LocalDate.now();
        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Input date in format dd-MM-yyyy");
        String trainingDate = scanner.nextLine();
        DateTimeFormatter trainingDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(myDateNow);
        System.out.println(trainingDateFormat);




    }
}
