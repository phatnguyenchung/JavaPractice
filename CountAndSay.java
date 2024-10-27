import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        char[] list = new char[]{'1'};
        int len = list.length;
        while (--n > 0) {
            char[] next = new char[len * 2];
            int end = len;
            len = 0;
            char digit = list[0], count = '1';
            for (int j = 1; j < end; j++) {
                if (list[j] == digit) count++;
                else {
                    next[len++] = count;
                    next[len++] = digit;
                    digit = list[j];
                    count = '1';
                }
            }
            next[len++] = count;
            next[len++] = digit;
            list = next;
        }
        return String.copyValueOf(list, 0, len);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("input n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(countAndSay(n));
    }
}
