import java.util.*;

public class KSortedArraySorter {
    public static void sortKSortedArray(int[] arr, int k) {
        // // Create a min heap (priority queue)
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // int n = arr.length;
        // int index = 0;

        // // Add first k+1 elements into the heap
        // for (int i = 0; i <= k && i < n; i++) {
        //     minHeap.add(arr[i]);
        // }

        // // Process the rest of the elements
        // for (int i = k + 1; i < n; i++) {
        //     arr[index++] = minHeap.poll();
        //     minHeap.add(arr[i]);
        // }

        // // Extract the remaining elements from the heap
        // while (!minHeap.isEmpty()) {
        //     arr[index++] = minHeap.poll();
        // }
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int n = arr.length, index=0, i;
        for(i = 0; i <= k && i < n; i++)
        {
            heap.add(arr[i]);
        }

        for(i = k+1; i < n; i++)
        {
            arr[index++] = heap.poll();
            heap.add(arr[i]);
        }

        while (!heap.isEmpty()) {
            arr[index++] = heap.poll();
        }

    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 8, 10, 9};
        int k1 = 3;
        sortKSortedArray(arr1, k1);
        printArray(arr1); // Output: 2 3 5 6 8 9 10 

        int[] arr2 = {1, 4, 5, 2, 3, 6, 7, 8, 9, 10};
        int k2 = 2;
        sortKSortedArray(arr2, k2);
        printArray(arr2); // Output: 1 2 3 4 5 6 7 8 9 10
    }
}
