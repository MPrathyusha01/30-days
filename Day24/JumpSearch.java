package Day24;

public class JumpSearch {

    // Method to perform jump search on a sorted array
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n)); // Determine the block size to jump

        int prev = 0;
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        // Perform linear search within the block
        while (arr[prev] < key) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // If element is found
        if (arr[prev] == key) {
            return prev;
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int key = 55;
        int result = jumpSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}

