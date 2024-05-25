package Day5;

import java.util.*;

public class LargestInArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 1, 2, 5, 5, 78));
        System.out.println(Collections.max(arr));
        int max = arr.get(0);

        for(int i=1; i<arr.size();i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }
}
