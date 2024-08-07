import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] socks = new int[2 * n];

        // Read the order of socks
        for (int i = 0; i < 2 * n; i++) {
            socks[i] = scanner.nextInt();
        }

        Set<Integer> table = new HashSet<>();
        int maxTableSize = 0;

        for (int sock : socks) {
            if (table.contains(sock)) {
                table.remove(sock);
            } else {
                table.add(sock);
                maxTableSize = Math.max(maxTableSize, table.size());
            }
        }

        System.out.println(maxTableSize);

        scanner.close();
    }
}
