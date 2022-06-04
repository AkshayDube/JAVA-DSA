package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boilerplate Start
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}//Boiler Plate end here
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	

}
