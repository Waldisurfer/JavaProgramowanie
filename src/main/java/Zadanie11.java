import java.util.*;

public class Zadanie11 {
    static void zadanie11() {
        String stringToGuess = "Starczy";
        System.out.println("Odgadnij wyraz!");
        Scanner scanner = new Scanner(System.in);
        List<String> listOfGuesses = new ArrayList<>();
        int longestString = 0;
        int index = 0;

        while (!(listOfGuesses.contains(stringToGuess))) {
            System.out.println("Podaj wyraz: ");
            String guess = scanner.nextLine();
            listOfGuesses.add(guess);
            if (guess.equals("")) {
                System.out.println("Nie podałes zadnego wyrazu");
            }
        }
        System.out.println("Brawo odgadles haslo: Starczy");
        for (int i = 0; i < listOfGuesses.size() - 1; i++) {
            //iterujemy od 0 do dlugosci listy-1 bo ostatni element to będzie odgadnięte hasło "Starczy"
            int currentElementLenght = listOfGuesses.get(i).length();
            if (currentElementLenght > longestString) {
                //jeśli długość i-tego elementu jest większa od zerowego to
                longestString = currentElementLenght;
                index = i; // w indexie zapisujemy przy ktorej iteracji i jednoczesnie
                // na ktorym miejscu w indeksie jest najwiecej znakow, czyli najdluzszy String
                // zamieniamy dlugosc zerowego elementu listy z i-tym elementem jesli jest wiekszy

            }

        }
        System.out.println(listOfGuesses.get(index));
    }
}