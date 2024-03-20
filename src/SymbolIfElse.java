import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SymbolIfElse {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number "); //first number
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number"); //second number
        double number2 = scanner.nextDouble();

        System.out.println("Enter symbol"); // (+,-,*,/)
        char symbol = scanner.next().charAt(0);

        double number; //if number in double

        if (symbol == '+'){
            number = number1 + number2;
            System.out.println("addition result = " + number);

        } else if (symbol == '-') {
            number = number1 - number2;
            System.out.println("Subtraction result = " + number);

        }else if (symbol == '*'){
            number = number1*number2;
            System.out.println("Multiplication result = " + number);

        }else if (symbol == '/') {
        number = number1/number2;
            System.out.println("Division result = " + number);

        }else {
            System.out.println("Invalid");
        }






    }
}
