import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoreIPAddress {
    public static void main(String[] args){
        System.out.println("Ipaddress restore:");
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        System.out.println(restoreIpAddresses(ip));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(String s, int start, List<String> temp, List<String> res) {
        if (temp.size() == 4) {
            if (start == s.length()) {
                res.add(String.join(".", temp));
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3; i++) {
            String sub = s.substring(start, i + 1);
            if (isValid(sub)) {
                temp.add(sub);
                backtrack(s, i + 1, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private static boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
}
