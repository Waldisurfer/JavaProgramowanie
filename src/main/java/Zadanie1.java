import java.util.Scanner;

public class Zadanie1 {
    static void zadanie1() {
        //zadanie 1
        float pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        float r = scanner.nextFloat();
        System.out.println(2 * pi * r);
        System.out.println(2 * Math.PI * r);
    }
}
