package Day6;
import java.util.*;
public class AddElementsin2DArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(5);
        list.get(2).add(6);
        list.get(2).add(6);
        list.get(2).add(6);
        list.get(2).add(6);
        list.get(1).add(6);
        System.out.println(list);

        int element = list.get(1).get(1);
        System.out.println("Element at (1, 1): " + element);
    }
}
