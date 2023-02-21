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
        int letters = scanner.nextInt();
        System.out.print("How many symbols would you like? ");
        int symbols = scanner.nextInt();
        System.out.print("How many numbers would you like? ");
        int numbers = scanner.nextInt();
        String easyPassword = "";
        if(letters+numbers+symbols == 0) {
            System.out.println("Invalid Password count.....");
        }
        else {
            Random rand = new Random();
            for (int i = 0; i < letters; i++) {
                easyPassword += (char) (rand.nextInt(26) + 'a');
            }
            for (int i = 0; i < symbols; i++) {
                easyPassword += "!@#$%^&*()_+-=[]{}|;':\",./<>?".charAt(rand.nextInt(23));
            }
            for (int i = 0; i < numbers; i++) {
                easyPassword += rand.nextInt(10);
            }
            System.out.println("Easy Password: " + easyPassword);
            List<Character> passwordList = new ArrayList<Character>();
            for (int i = 0; i < letters; i++) {
                passwordList.add((char) (rand.nextInt(26) + 'a'));
            }
            for (int i = 0; i < symbols; i++) {
                passwordList.add("!@#$%^&*()_+-=[]{}|;':\",./<>?".charAt(rand.nextInt(23)));
            }
            for (int i = 0; i < numbers; i++) {
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
}
