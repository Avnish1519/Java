import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int arr[] = new int[n];
		//using for loop here
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int min=arr[0];
		//again using a for loop for calculations
		for(int i=1;i<n;i++){
		    if(arr[i]<min){
		        min=arr[i];
		    }
		    
		}
		System.out.println(min);
		
		
	}
}
