package Day20;

public class QuickSort {

    // Swap counter
    private static int swapCount = 0;

    // Method to perform quick sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap array[i+1] and array[high] (or pivot)
        swap(array, i + 1, high);

        return i + 1;
    }

    // Method to swap two elements in an array and increment the swap counter
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swapCount++; // Increment swap counter
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(array);

        System.out.println("Total number of swaps: " + swapCount);
    }
}


