import java.util.Scanner;

public class Zadanie2 {
    static void zadanie2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight in kg: ");
        double weight = scanner.nextFloat();
        System.out.println("Input your height in cm: ");
        double height = scanner.nextFloat();
        double bmi = weight / Math.pow(height/100, 2);
        System.out.println("Your BMI is : " + bmi);

        if (bmi >= 18.5 && bmi <=24.9) {
            System.out.println("Your BMI is optimal");
        }
        else {
            System.out.println("Your BMI is not optimal");
        }
    }
}
