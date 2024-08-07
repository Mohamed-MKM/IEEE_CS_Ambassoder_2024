import java.util.Scanner;

public class Main {


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z = scanner.nextInt();


        int lcm_nm = lcm(n, m);


        int result = z / lcm_nm;


        System.out.println(result);

        scanner.close();
    }
}
