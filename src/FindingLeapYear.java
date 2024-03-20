import java.util.Scanner;

public class FindingLeapYear {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year to check if it is a leap year or not");
        int Year = scanner.nextInt();

        if (Year%4 == 0){ // % because need to check if divisible by 4
            System.out.println(" Its a leap year");

        } else {
            System.out.println("its not a leap year");
        }


    }
}
