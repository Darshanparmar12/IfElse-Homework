import java.util.Scanner;

public class ValueCheck {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character");
        char a = scanner.next().charAt(0);

        if (a >= 'A' && a <= 'Z'){ //&& and operator to cover alphabet condition
            System.out.println("Its an Alphabet");

        } else if (a >= '0' && a <= '9') {
            System.out.println("Its a number");

        }else{
            System.out.println("Its a symbol");
        }

    }
}
