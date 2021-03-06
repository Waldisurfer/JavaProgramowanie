import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie16 {
    static void zadanie16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 integers: ");
        int lastNumber = 0;
        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > lastNumber){
                count += 1;
                if (maxCount < count){
                    maxCount = count;
                }
            }
            else {
                count = 1;
            }
            lastNumber = number;
        }

        System.out.println(maxCount);
    }
}
