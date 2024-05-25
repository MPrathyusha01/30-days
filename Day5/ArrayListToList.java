package Day5;
import java.util.*;
public class ArrayListToList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
