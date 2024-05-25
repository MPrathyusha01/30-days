package Day5;
import java.util.*;
public class CreateArrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(0);
        arr2.add(1);

        System.out.println(arr);
        System.out.println((arr2));
    }
}
