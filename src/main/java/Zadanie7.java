import java.util.Scanner;

public class Zadanie7 {
    static void zadanie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();


        if (n == 0) {
            System.out.println(n);
        } else if (n == 1) {
            System.out.println(n);
        } else {
            double fibonacci = (1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n)) - (1 / Math.sqrt(5)) * (Math.pow((1 - Math.sqrt(5)) / 2, n));
            System.out.println((int)fibonacci);
        }

    }
}

