public class Java220324 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
