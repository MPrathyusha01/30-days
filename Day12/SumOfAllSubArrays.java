package Day12;
import java.util.*;
public class SumOfAllSubArrays {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        int len = arr.length;
        for(int start=0; start<len;start++){
            int sum = 0;
            for(int end = start; end<len;end++){
                sum +=arr[end];
                System.out.println("["+start+","+end+"] = "+sum);
            }
        }

    }
}
