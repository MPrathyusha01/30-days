package Day3;
import java.util.*;
public class RotateRightByOne{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        int last = arr[len-1];
        for(int i=len-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
}
