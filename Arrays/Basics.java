//Writing a basic code in java
import java.util.*;
class Basics{
    public static void main(String[] args){
        //  This is an object
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};//initializing arrays
        int[] arr2 = {1, 2, 3, 4, 5};//initializing arrays
        
        int[][] mul = new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0;j<arr2.length; j++) {
                mul[i][j]=arr1[i]*arr2[j];
            }
        }
        
        for(int i=0; i<mul.length; i++) {
            for(int j=0;j<mul.length; j++) {
                System.out.println(mul[i][j]);
            }
        }

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
            System.out.print(arr[i] + " ");//printing the output
        }
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);//printing the value

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int avg;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        avg = sum/arr1.length;
        int multiplication =0;
        System.out.println("Avg: " + avg);//printing average
        System.out.println("Sum: " + sum);//printing sum

        int[][] num = {{1,2},{3,4}};
        
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num[i].length; j++) {
                System.out.print(num[i][j]+" ");//printing output
            }
        }
        System.out.println();//uesd for new line
        

        sc.close();  //using sc.close to close the scanner
    }
}
