import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number to find Positive/Negative or Zero");
        double number = scanner.nextInt();

        if (number >1 ){
            System.out.println("Positive number");
        } else if (number ==0){
            System.out.println("Zero number");
        }else {
            System.out.println("Negative number");
        }
    }
}
