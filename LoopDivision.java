import java.util.Scanner;

public class LoopDivision {
    public static void main(String[] args) {
        System.out.println("Input N:");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i % 2 == 0 ? i + " " : "");
        }
    }
}
