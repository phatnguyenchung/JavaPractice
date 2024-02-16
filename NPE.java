import java.util.Scanner;

public class NPE {
    public static void main(String[] args) {
        String _text;
        //Fix NPE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        _text = scanner.next();
        System.out.println(_text);
        int length = _text.length();
        System.out.println(length);
    }
}
