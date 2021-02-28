import java.util.Scanner;

public class Zadanie6 {
    static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        double number = 0;

        for (int i = 1; i <= n; i++) {
            number += 1.0 / i;
        }
        System.out.println(number);
    }
}

