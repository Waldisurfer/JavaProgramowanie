import java.util.Scanner;

public class Zadanie5p2 {
    static void zadanie5p2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = scanner.nextInt();
        int primeNumber = 0;

        for (int i = 2; i < number; i++) {
            int numberOfDivisions = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numberOfDivisions = numberOfDivisions + 1;
                }
            }
            if (numberOfDivisions == 2) {
                primeNumber = i;
                System.out.println(primeNumber);
            }
        }
    }
}

