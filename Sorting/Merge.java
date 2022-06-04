package Sorting;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		
		int[] arr1= {1,3,5,7,9};//Sorted array1
		int[] arr2= {2,4,6,8,10};//Sorted array2
		
		int[] arr3=merge(arr1,arr2);//Sorted array3
		System.out.println(Arrays.toString(arr3));

	}

	//function to merge two sorted array and return another array
	public static int[] merge(int[] arr1, int[] arr2) {
		int current=0,counter1=0,counter2=0;//counter 1 for array1 and counter2 for array2
		int[] arr=new int[arr1.length+arr2.length];
		while(counter1<arr1.length && counter2<arr2.length) {
			if(arr1[counter1]<=arr2[counter2]){
				arr[current]=arr1[counter1];
				current++;counter1++;
			}
			else {
				arr[current]=arr2[counter2];
				current++;counter2++;
			}
		}
		while(counter1<arr1.length) {
			arr[current]=arr1[counter1];
			current++;counter1++;
		}
		while(counter2<arr2.length) {
			arr[current]=arr2[counter2];
			current++;counter2++;
		}
		return arr;
	}

}
