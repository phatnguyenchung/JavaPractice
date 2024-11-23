import java.util.Scanner;

public class Test2311 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input n:");
            n = scanner.nextInt();
        } while (n < 0);
        for (int i = 0; i <= n; i++) {
            String result = (i % 2 == 0) ? "even" : "odd";
            System.out.println(i + ":" + result);
        }
        scanner.close();
    }
}
