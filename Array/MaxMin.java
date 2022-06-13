package Array;

public class MaxMin {

	public static void main(String[] args) {
		
		int[] arr= {10,1,9,2,8,3,7,4,6,5};
		System.out.println("Smallest element index :  "+minimum(arr));
		System.out.println("Largest element index : "+maximum(arr));

	}



//find the index of minimum element in array
static int minimum(int[] arr) {
	int res=0;
	for(int i=1;i<arr.length;i++){
		if(arr[i]<arr[res])
			res=i;
	}
	return res;
}

//find the index of minimum element in array
static int maximum(int[] arr) {
	int res=0;
	for(int i=1;i<arr.length;i++){
		if(arr[i]>arr[res])
			res=i;
	}
	return res;
}

}