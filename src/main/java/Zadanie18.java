import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    static void zadanie18() {
        Scanner scanner = new Scanner(System.in);
        String regex = "(a+ psik)";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Input: ");
        String userInput = scanner.nextLine();
        Matcher matcher = pattern.matcher(userInput);

        if (matcher.find()) {
            System.out.println("Na zdrowie!");
        }


    }
}
