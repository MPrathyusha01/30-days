package Day6;

import java.util.ArrayList;

public class Transpose2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);

        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();
        for (int i = 0; i < list.get(0).size(); i++) {
            transposed.add(new ArrayList<>());
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                transposed.get(j).add(list.get(i).get(j));
            }
        }
        System.out.println(list);
        System.out.println(transposed); 
    }
}
