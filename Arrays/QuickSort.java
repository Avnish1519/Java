public class QuickSort {

    // Method to perform the quicksort
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);  // Recursively sort the left subarray
            quickSort(array, partitionIndex + 1, right); // Recursively sort the right subarray
        }
    }

    // Method to partition the array and return the pivot index
    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    // Method to swap two elements in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test the quicksort
    public static void main(String[] args) {
        int[] array = { 34, 7, 23, 32, 5, 62 };
        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Method to print the elements of the array
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
