package Day12;
import java.util.*;
public class AllSubArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        int len = arr.length;
        int newarrlen = len*(len-1)/2;
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < len; start++) {
            for (int end = start; end < len; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int rot = start; rot <= end; rot++) {
                    subarray.add(arr[rot]);
                }
                subarrays.add(subarray);
            }
        }

        System.out.println(subarrays);
    }
}
