import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        scanner.close();

        if (n < 26) {

            System.out.println("NO");
            return;
        }

        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : input.toLowerCase().toCharArray()) {
            uniqueLetters.add(c);
        }

        if (uniqueLetters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}