import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie10 {
    static void zadanie10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int tempDigit;
        int digitSum = 0;

        for (int i = 1; i <= tempNumber; ) { //iterujemy tak długo aż nasza liczba będzie mniejsza lub równa 1
            tempDigit = tempNumber % 10 * i; //resta z dzielenia przez 10 to będzie ostatnia liczba np. number 123, modulo z 10 =3
            System.out.println(tempDigit); //wypisuje ostatnią cyfrę
            digitSum += tempDigit; // robię sumę ostatnich cyfr
            tempNumber = (tempNumber - tempDigit) / 10; // np. liczba 123 odejmuję ostatnią cyfrę 123-3=120 i dzielę przez 10
        }
        System.out.println(digitSum);

    }
}
//        int[] numbersTab = number.chars().map(Character.getNumericValue().toArr)
//        List<Integer> numbersList = new ArrayList<>();
//        char[] numberArray = number.toCharArray();
//        System.out.println(number.toCharArray());