
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie17 {
    static void zadanie17() {
        Scanner sc = new Scanner(System.in);
        String dataZajec = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(dataZajec, formatter);
        /*LocalDate dataSDA = LocalDate.of(2022,03,13);*/
        LocalDate dataTeraz = LocalDate.now();
        System.out.println(dataTeraz);
        /*System.out.println(dataSDA);*/
        System.out.println(Math.abs(localDate.toEpochDay() - dataTeraz.toEpochDay()));
    }
}
