package datastructure.algorithms.searchingalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3, 7};
        int target = 12;
        
        int index = linearSearch(arr, target);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}

