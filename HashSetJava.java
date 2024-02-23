import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class HashSetJava {
    public static void main(String[] args){
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
        HashSet<Integer> hashSet = new HashSet<Integer>(list1);
        List<Integer> newList = new ArrayList<Integer>(hashSet);
        for(Integer ob : newList){
            System.out.print(ob + " ");
        }
    }

}
