package Day19;

import java.util.ArrayList;

public class BubbleSortExample {
    // Method to perform Bubble Sort on an ArrayList
    public static int bubbleSort(ArrayList<Integer> numbers) {
        int swapCount = 0;
        boolean isSwapped = true;
        int lastUnsortedIndex = numbers.size();

        // While loop to continue until no swaps are made
        while (isSwapped) {
            isSwapped = false;
            // For loop to traverse unsorted part of the list
            for (int i = 1; i < lastUnsortedIndex; i++) {
                // Compare adjacent elements
                if (numbers.get(i - 1) > numbers.get(i)) {
                    // Swap elements if they are in the wrong order
                    int temp = numbers.get(i - 1);
                    numbers.set(i - 1, numbers.get(i));
                    numbers.set(i, temp);
                    isSwapped = true;
                    swapCount++; // Increment swap counter
                }
            }
            lastUnsortedIndex--; // Reduce the range of the unsorted part of the list
        }

        return swapCount; // Return the number of swaps made
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);

        System.out.println("Unsorted list: " + numbers);
        
        // Sorting the ArrayList using Bubble Sort
        int swapCount = bubbleSort(numbers);

        System.out.println("Sorted list: " + numbers);
        System.out.println("Total number of swaps: " + swapCount);
    }
}

