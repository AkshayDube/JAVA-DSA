package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));		

	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					flag=false;
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			if(flag) {
				break;
			}
		}
	}

}
