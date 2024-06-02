package Day13;

public class SlidingWindow {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,56,7,8};
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        int k=3;

        for(int i=0; i<k;i++){
            wSum = wSum+arr[i];
        }

        for(int i=k;i<arr.length;i++){
            wSum = wSum-arr[i-k]+arr[i];
            mSum = Math.max(wSum,mSum);
        }
        System.out.println(mSum);
    }
}
