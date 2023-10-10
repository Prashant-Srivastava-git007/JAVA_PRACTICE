import java.util.Scanner;

public class vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input character from the user
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Convert the character to lowercase to handle both uppercase and lowercase input
        char charLowerCase = Character.toLowerCase(inputChar);

        // Check if the input character is a vowel
        if (charLowerCase == 'a' || charLowerCase == 'e' || charLowerCase == 'i' || charLowerCase == 'o' || charLowerCase == 'u') {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is a consonant.");
        }
        
        scanner.close();
    }
}
