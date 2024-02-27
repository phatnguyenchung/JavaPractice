import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetJava {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1);
        HashSet<Integer> hashSet = new HashSet<>(list1);
        List<Integer> newList = new ArrayList<>(hashSet);
        for (Integer ob : newList) {
            System.out.print(ob + " ");
        }
        System.out.println();
        Set<Integer> integers = new HashSet<>();
        for (int num : list1) {
            if (!integers.add(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        for(int num : list1){
            if(integers.remove(num)){
                System.out.print(num + " ");
            }
        }
    }

}
