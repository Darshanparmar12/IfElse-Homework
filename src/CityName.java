import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet from A to F - ");
        char alphabet = scanner.next().charAt(0); //char because character
        if (alphabet == 'A') {
            System.out.println("City Name - Ahmedabad ");
        } else if (alphabet == 'B') {
            System.out.println("City Name - Birmingham");
        } else if (alphabet == 'C') {
            System.out.println("City Name - Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City Name - Dublin");
        } else if (alphabet == 'E') {
            System.out.println("City Name - Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("City Name - Florida");
        } else { //for other alphabet
            System.out.println("Invalid");
        }

    }
}

