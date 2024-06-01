package Day12;
import java.util.*;
public class RetrunUniqueNumber {
    public static void main(String args[]){
        int[] arr = {1,1,2,2,3,4,5,6};
        HashSet<Integer> newarr = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            newarr.add(arr[i]);
        }

        System.out.println(newarr);
    }
}
