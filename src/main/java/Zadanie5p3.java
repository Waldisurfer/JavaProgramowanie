import java.util.Scanner;

public class Zadanie5p3 {
    static void zadanie5p3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = scanner.nextInt();
        int primeNumber;

        for (int i = 2; i < number; i++) {
            int numberOfDivisions = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numberOfDivisions = numberOfDivisions + 1;
                }
            }
            if (numberOfDivisions == 0) {
                primeNumber = i;
                System.out.println(primeNumber);
            }
        }
    }
}

