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
        Pattern matcher = Pattern.compile("[a-zA-Z]");

        System.out.println(matcher.matcher(firstLetter));
        System.out.println(matcher.matcher(secondLetter));

        if (firstLetter.length() == 1 && secondLetter.length() == 1){
            char firstChar = firstLetter.toLowerCase().charAt(0);
            char secondChar = secondLetter.toLowerCase().charAt(0);
            int asciiFirstChar = (int) firstChar;
            int asciiSecondChar = (int) secondChar;

            int asciiDistance = asciiFirstChar - asciiSecondChar;

            System.out.println("The distance between " + firstChar + " and " + " is: " + Math.abs(asciiDistance));
        }
        else {
            System.out.println("Input first and second letter of alphabet");
        }





    }
}
