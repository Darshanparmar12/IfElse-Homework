import java.util.Scanner;
import java.util.SortedMap;

public class FindingAverage {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers to find average");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        //Created formula to find average and print
        double average = (number1 + number2 + number3 + number4 + number5)/5.0; //total number 5

        System.out.println("Average of five number is " + average);

}



}