import java.util.Scanner;

public class Zadanie8 {
    static void zadanie8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        float number1 = scanner.nextFloat();
        System.out.println("Input your operator: (+, -, * or /)");
        char character = scanner.next().charAt(0);
        System.out.println("Input second number: ");
        float number2 = scanner.nextFloat();

        if (number2 == 0 && character == '/') {
            System.out.println("Can not divide by 0");

        } else
            switch (character) {
                case '+' -> System.out.println(number1 + number2);
                case '-' -> System.out.println(number1 - number2);
                case '*' -> System.out.println(number1 * number2);
                case '/' -> System.out.println(number1 / number2);
                default -> System.out.println("Wrong operator");

            }

    }
}
