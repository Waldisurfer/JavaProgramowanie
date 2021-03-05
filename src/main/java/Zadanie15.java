import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie15 {
    static void zadanie15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 integers: ");
        List integers = new ArrayList();
        List multipleIntegers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (integers.contains(number) && !multipleIntegers.contains(number)) {
                multipleIntegers.add(number);
            } else {
                integers.add(number);
            }
        }
        System.out.println(multipleIntegers);

    }
}
