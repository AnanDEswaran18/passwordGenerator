import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Password Generator!");
        System.out.print("How many letters would you like in your password? ");
        int nrLetters = scanner.nextInt();
        System.out.print("How many symbols would you like? ");
        int nrSymbols = scanner.nextInt();
        System.out.print("How many numbers would you like? ");
        int nrNumbers = scanner.nextInt();

//         String easyPassword = "";
//         Random rand = new Random();
//         for (int i = 0; i < nrLetters; i++) {
//             easyPassword += (char)(rand.nextInt(26) + 'a');
//         }
//         for (int i = 0; i < nrSymbols; i++) {
//             easyPassword += "!@#$%^&*()_+-=[]{}|;':\",./<>?".charAt(rand.nextInt(23));
//         }
//         for (int i = 0; i < nrNumbers; i++) {
//             easyPassword += rand.nextInt(10);
//         }
//         System.out.println("Easy Password: " + easyPassword);
        
        List<Character> passwordList = new ArrayList<Character>();
        for (int i = 0; i < nrLetters; i++) {
            passwordList.add((char)(rand.nextInt(26) + 'a'));
        }
        for (int i = 0; i < nrSymbols; i++) {
            passwordList.add("!@#$%^&*()_+-=[]{}|;':\",./<>?".charAt(rand.nextInt(23)));
        }
        for (int i = 0; i < nrNumbers; i++) {
            passwordList.add(Character.forDigit(rand.nextInt(10), 10));
        }
        Collections.shuffle(passwordList);
        String hardPassword = "";
        for (char c : passwordList) {
            hardPassword += c;
        }
        System.out.println("Hard Password: " + hardPassword);
    }
}
