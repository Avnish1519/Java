import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int prefixSum[] = new int[n];
        
        
        prefixSum[0] = arr[0]; 
        for (int i = 1; i < n; i++) { //using for-loop
            prefixSum[i] = prefixSum[i - 1] + arr[i]; 
        }
        
        System.out.println(Arrays.toString(prefixSum));//printing output
    }
}
