import java.util.Scanner;

public class RoundHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int initialPosition = a - 1;
        int finalPosition = (initialPosition + b % n + n) % n;

        int result = finalPosition + 1;

        System.out.println(result);

        scanner.close();
    }
}
