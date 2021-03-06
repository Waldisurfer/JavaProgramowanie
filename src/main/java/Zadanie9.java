import java.util.Scanner;

public class Zadanie9 {
    static void zadanie9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = scanner.nextInt();
        String wave1 = "*\n" +
                " *\n" +
                "  *\n" +
                "   *";
        String wave2 = "*      *\n" +
                " *    *\n" +
                "  *  *\n" +
                "   **";

        if (number % 2 == 0){
           int evenNumberPeriod = number / 2;
           for (int i = 1; i <= evenNumberPeriod; i++) {
               System.out.println(wave2 + wave2);
           }
        }




//        for (int i = 1; i <= number; i++) {
//            if (i <= 4) {
//
//            }
//
//        }

    }
}

        // number liczba podana przez uzytkownika
        // wykorzystac modulo number i cala czesc z dzielenia to ilosc okresow + modulo to ilosc gwiazdek ostatniego okresu
        // zrobic warunek jesli czesc cala dzielenia jest niepartzysta to robimy pierwsza czesc fali a jesli parzysta to druga
//        String wave1 = "*";
//        String wave2 = " *";
//        String wave3 = "  *";
//        String wave4 = "   *";
//        String wave5 ="       *";
//        String wave6 ="      *";
//        String wave7 ="     *";
//        String wave8 ="    *";
//
//
//            if (number<=4){
//                System.out.println(wave1);
//                System.out.println(wave1);
//                System.out.println(wave1);
//                System.out.println(wave1);



