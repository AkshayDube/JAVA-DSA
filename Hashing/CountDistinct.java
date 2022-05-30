//WAP to find the distinct elements in Array
package Hashing;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CountDistinct {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in Array");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] array=new int[N];
		System.out.println("Enter the array elements");
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println(countDistinct(array));
	}
	
	//Method to count distinct elements in array
	static int countDistinct(int[] array) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		return set.size();
	}

}
