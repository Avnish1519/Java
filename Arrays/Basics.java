//Writing a basic code in java
import java.util.*;
class Basics{
    public static void main(String[] args){
        //  This is an object
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] + arr2[i];
        }

        System.out.println("Sum: " + sum);
        int n = sc.nextInt();
        int arr[] = new int[n];  // Initializing the array with size n

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);


        sc.close();  //using sc.close to close the scanner
    }
}
