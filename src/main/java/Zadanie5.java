import java.util.Scanner;

public class Zadanie5 {
    static void zadanie5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        int positiveInteger = scanner.nextInt();

        for (int i = 1; i<positiveInteger;i++) {
            int licznik = 0;
            //zlicza dzielnik modulo bez reszty
            for(int num = i; num >= 1; num--){
                if (i%num==0){
                    licznik = licznik + 1;
                }
            }
            if (licznik==2){
                System.out.println(i);
            }

        }
    }
}

