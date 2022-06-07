package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}//Boiler Plate end here
		
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void mergeSort(int arr[],int low,int high) {
		 if (low < high) {
	            // Find the middle point
	            int mid =low+ (high-low)/2;
	 
	            // Sort first and second halves
	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);
	 
	            // Merge the sorted halves
	            merge(arr, low, mid, high);
	        }
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}

}
