import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //used as object to take input as using system.in  
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int key = sc.nextInt();//taking input

        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
}
