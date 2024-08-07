import java.util.Scanner;
import java.util.HashSet;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int nextYear = findNextBeautifulYear(y);
        System.out.println(nextYear);
        scanner.close();
    }

    private static int findNextBeautifulYear(int y) {
        while (true) {
            y++;
            if (hasDistinctDigits(y)) {
                return y;
            }
        }
    }

    private static boolean hasDistinctDigits(int year) {
        String yearStr = String.valueOf(year);
        HashSet<Character> seen = new HashSet<>();
        for (char digit : yearStr.toCharArray()) {
            if (seen.contains(digit)) {
                return false;
            }
            seen.add(digit);
        }
        return true;
    }
}