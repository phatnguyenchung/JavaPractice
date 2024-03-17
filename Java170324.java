public class Java170324 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        changeArray(arr);
        System.out.println(arr[0]);
    }

    public static void changeArray(int[] arr){
        arr[0] = 10;
        arr = null;
    }
}
