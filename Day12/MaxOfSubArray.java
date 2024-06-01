package Day12;
public class MaxOfSubArray {
    public static void main(String args[]){
        int[] arr ={-4,-2,-3,-1,-4,-1};
        int maxi = arr[0];
        int curr = arr[0];

        for(int i=1;i<arr.length;i++){
            curr = Math.max(curr, curr+arr[i]);
            maxi = Math.max(curr,maxi);
        }

        System.out.println(maxi);
    }
}
