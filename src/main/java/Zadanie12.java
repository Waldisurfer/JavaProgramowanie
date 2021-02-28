import java.util.Scanner;

public class Zadanie12 {
    static void zadanie12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz swoj tekst: ");
        String text = scanner.nextLine();
        //zaminiam Stringa na tablice charow
        char[] chars = text.toCharArray();
        int numberOfSpacebars = 0;
        double percentageNumberOfSpaces;
        int charLength = chars.length;

        for (int i = 0; i < charLength; i++) {
            if (chars[i] == ' ') {
                numberOfSpacebars = numberOfSpacebars + 1;
            }
        }

        percentageNumberOfSpaces = (double) numberOfSpacebars / charLength * 100;
        System.out.println("Liczba spacji: " + numberOfSpacebars);
        System.out.println("Liczba znakow: " + charLength);
        System.out.println("Procentowo liczba spacji do wszystkich znaków: " + percentageNumberOfSpaces + "%");
    }
}
