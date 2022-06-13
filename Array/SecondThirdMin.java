package Array;

public class SecondThirdMin {

	//find the second largest in array 
	static int secondSmallest(int[] arr){
		int smallest=0,second_smallest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[smallest]) {
				second_smallest=smallest;
				smallest=i;
			}
			else if(arr[i]>arr[smallest]) {
				if(second_smallest==-1 || arr[i]<arr[second_smallest])
					second_smallest=i;
			}	
		}
		return second_smallest;
	}
	
	//find the third largest in array 
	static int thirdSmallest(int[] arr){
		int smallest=0,second_smallest=-1,third_smallest=-1;
		if(arr.length<3) return -1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[smallest]) {
				third_smallest=second_smallest;
				second_smallest=smallest;
				smallest=i;
			}
			else if(arr[i]>arr[smallest]) {
				if(second_smallest==-1||arr[i]<arr[second_smallest]) {
					third_smallest=second_smallest;
					second_smallest=i;
				}
				else if(arr[i]>arr[second_smallest]) {
					if(third_smallest==-1||arr[i]<arr[third_smallest]) {
						third_smallest=i;
					}
				}
			}
		}
		return third_smallest;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,4,5,6,7,8,9,1,2,3};
		System.out.println("Second smallest index : " + secondSmallest(arr));
		System.out.println("Third smallest index : " + thirdSmallest(arr));

	}
}
