import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check if it is even or odd number");
        int a = scanner.nextInt();
        if (a%2==0){ //% operator because to check if the number is divisible by 2

            System.out.println( " Number is odd" );
        }else {
            System.out.println(a + " is even");

        }


}


}
