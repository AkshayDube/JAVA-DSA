//Program to find the intersection of two sorted arrays
package Sorting;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5,6,7,8};
		int[] arr2= {1,3,6,7,8,9,10};
		
		if(arr1.length>=arr2.length)
		intersect(arr1,arr2);
		else
		intersect(arr2,arr1);

	}

	public static void intersect(int[] arr1, int[] arr2) {
		int i=0,j=0;
		for(int k=0;k<arr1.length;k++) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {//arr1[i]==arr2[j]
				if(i==0 || arr1[i]!=arr1[i-1]) {
					System.out.print(arr1[i] + " ");
					i++;j++;
				}
				else {
					i++;j++;
				}
			}
		}
	}

}
