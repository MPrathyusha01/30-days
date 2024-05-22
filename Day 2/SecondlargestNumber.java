import java.util.Arrays;
public class SecondlargestNumber {
    public static int SecondLarge(int arr[]) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String args[]){
        int arr[] = {1,2,2,3,4,1};
        System.out.println(SecondLarge(arr));
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
