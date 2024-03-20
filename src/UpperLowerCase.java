import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any uppercase letter ");

        char capitalAlphabet = scanner.next().charAt(0); // for first input

        char smallAlphabet = Character.toLowerCase(capitalAlphabet); // to convert character into lower case

        System.out.println("Lower case of " + capitalAlphabet + " is " + smallAlphabet);


    }
}
