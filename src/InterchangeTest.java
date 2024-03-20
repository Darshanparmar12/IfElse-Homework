import java.util.Scanner;

public class InterchangeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers to interchange");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Second number first which is " + number1);
        System.out.println("First number second which is " + number2);
    }
}
