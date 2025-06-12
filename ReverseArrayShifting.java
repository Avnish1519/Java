import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayShifting {//performing reverse array shifting
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];//size

        
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Reverse the array using an additional array
        int[] reversedArray = reverse(originalArray);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0; // Index for the new array

        // Copy elements from the original array in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }

        return newArray;
    }
} 