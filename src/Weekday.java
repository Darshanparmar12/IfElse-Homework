import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 7 to find day of the week");

        int dayNumber = scanner.nextInt();

        if (dayNumber == 1) {
            System.out.println("Monday" );
        }else if (dayNumber ==2){
            System.out.println("Tuesday" );
        }else if (dayNumber ==3 ) {
            System.out.println(" Wednesday " );
        } else if (dayNumber == 4) {
            System.out.println("Thursday  " );
        } else if (dayNumber == 5) {
            System.out.println("Friday  " );
        } else if (dayNumber == 6) {
            System.out.println("Saturday ");
        } else if (dayNumber == 7) {
            System.out.println("Last day of week Sunday");
        }else {
            System.out.println("Invalid");
        }
    }
}
