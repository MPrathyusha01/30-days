public class ReversingAnArray {
    public static void Reverse(int[] arr) {
        int len = arr.length;
        int temp = 0;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,12};
        Reverse(arr);
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
