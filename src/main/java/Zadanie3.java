import java.util.Scanner;

public class Zadanie3 {
    static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Input number a: ");
        int a = scanner.nextInt();
        System.out.println("Input number b: ");
        int b = scanner.nextInt();
        System.out.println("Input number c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        if (delta < 0){
            System.out.println("Negative delta");
        }
        else {
            System.out.println(delta);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
