package Sorting;

import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		//Boilerplate Start
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}//Boiler Plate end here
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	//Function to sort an array using Selection Sort
	static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			//swap arr[i] and arr[min]
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

}
