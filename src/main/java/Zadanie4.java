import java.util.Scanner;

public class Zadanie4 {
    static void zadanie4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++){
            if (i % 3== 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            }
            else if (i % 7 == 0){
                System.out.println("Paf");
            }
            else if (i % 3 == 0){
                System.out.println("Pif");
            }
            else {
                System.out.println(i);
            }
        }

    }

}
