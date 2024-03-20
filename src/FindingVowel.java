import java.util.Scanner;

public class FindingVowel {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet");

        char alphabet = scanner.next().charAt(0);
        //operator || (Or ) used
        if ( alphabet == 'a' || alphabet  == 'e' || alphabet  == 'i' || alphabet  == 'o' || alphabet  == 'u'){
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }

    }
}
