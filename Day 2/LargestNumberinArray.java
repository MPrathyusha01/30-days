public class LargestNumberinArray {
    public static int Large(int arr[]){
        int len = arr.length;
        int max = arr[0];
        for(int i = 1; i<len;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,0};
        System.out.println(Large(arr));
    }
}
