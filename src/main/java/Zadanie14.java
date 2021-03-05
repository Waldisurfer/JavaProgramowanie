import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie14 {
    static void zadanie14(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first letter: ");
        String firstLetter = scanner.nextLine();
        System.out.println("Input second letter: ");
        String secondLetter = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher firstMatcher = pattern.matcher(firstLetter);
        Matcher secondMatcher = pattern.matcher(secondLetter);
        char firstChar = firstLetter.toLowerCase().charAt(0);
        char secondChar = secondLetter.toLowerCase().charAt(0);

        if (firstMatcher.find() && secondMatcher.find() && firstLetter.length() == 1 && secondLetter.length() == 1){
            int asciiDistance = (int) firstChar - (int) secondChar;
            System.out.println("The distance between " + firstChar + " and " + secondChar + " is: " + Math.abs(asciiDistance));
        }
        else {
            System.out.println("Wrong input");
        }
    }
}
