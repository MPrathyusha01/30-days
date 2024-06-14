package Day25;

public class InterpolationSearch {

    // Method to perform interpolation search on a sorted array
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) {
                    return low;
                }
                return -1;
            }

            // Estimate the position of the key
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Check if the key is at the estimated position
            if (arr[pos] == key) {
                return pos;
            }

            // If key is larger, key is in the upper part
            if (arr[pos] < key) {
                low = pos + 1;
            }
            // If key is smaller, key is in the lower part
            else {
                high = pos - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int key = 18;
        int result = interpolationSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
