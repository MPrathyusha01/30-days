package Day12;
import java.util.*;
public class PrefixSum {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> prefix = new ArrayList<>();
        prefix.add(arr.get(0));
        for(int i=1; i<arr.size();i++){
            prefix.add(prefix.get(i-1)+arr.get(i));
        }
        System.out.println(arr);
        System.out.println(prefix);
    }
}
