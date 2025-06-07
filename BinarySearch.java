public class BinarySearch {//class
    public static int binarySearch(int[] array, int target) {//function
        int left = 0;
        int right = array.length - 1;
//loop
        while (left <= right) {//loop
            int mid = left + (right - left) / 2;
   
            //using if else loop
            if (array[mid] == target) {//condition
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;//left part of array
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};//array declaration
        int target = 10;
        int result = binarySearch(array, target);//calling of binary function and passing it to result
        
        //using if else loop
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
