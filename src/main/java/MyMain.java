import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {
    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size()-1 == i) {
            return true;
        }
        else if (isSortedRec(list, i + 1)) {
            if (list.get(i) <= list.get(i+1)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if ((arr.length == i) && (count == 0)) {
            return true;
        }
        else if ((arr.length == i) && (count != 0)) {
            return false;
        }
        else if (arr[i] == x) {
            if (hasCountCopiesRec(arr, x, count-1, i+1)) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (arr[i] != x) {
            if (hasCountCopiesRec(arr, x, count, i+1)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
        
    }
 
    
    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {   
        int middleIndex = lowerBound + (upperBound - lowerBound) / 2;
        if (lowerBound > upperBound) {
            return false;
        }
        else if (arr[middleIndex] < num) {
            return binarySearchRec(arr, num, middleIndex + 1, upperBound);
            
        }
        else if (arr[middleIndex] > num) {
            return binarySearchRec(arr, num, lowerBound, middleIndex - 1);
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4}));
        System.out.println(isSorted(list1));
    }
}
