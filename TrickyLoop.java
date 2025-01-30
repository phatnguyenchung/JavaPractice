public class TrickyLoop {
    public static void main(String[] args){
        int number = 5;
        boolean flag = false;
        do{
            if (number % 2 == 0){
                number = number / 2;
            }else {
                number = number * 3 + 1;
                flag = true;
            }
        }while (number != 1 && !flag);
        System.out.println(number);
    }
}
