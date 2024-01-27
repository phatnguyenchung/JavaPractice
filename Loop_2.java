public class Loop_2 {
    public static void main(String[] args){
        int i = 0;
        loop: for (; true; i++) {
            for (; i < 5; i++) {
                if (i == 3) break loop;
            }
        }
        System.out.println(i);
    }
}
