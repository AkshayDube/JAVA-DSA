package Array;

public class SecondThirdMax {

	//find the second largest in array 
	static int secondLargest(int[] arr){
		int largest=0,second_largest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				second_largest=largest;
				largest=i;
			}
			else if(arr[i]<arr[largest]) {
				if(second_largest==-1 || arr[i]>arr[second_largest])
					second_largest=i;
			}	
		}
		return second_largest;
	}
	
	//find the third largest in array 
	static int thirdLargest(int[] arr){
		int largest=0,second_largest=-1,third_largest=-1;
		if(arr.length<3) return -1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				third_largest=second_largest;
				second_largest=largest;
				largest=i;
			}
			else if(arr[i]<arr[largest]) {
				if(second_largest==-1||arr[i]>arr[second_largest]) {
					third_largest=second_largest;
					second_largest=i;
				}
				else if(arr[i]<arr[second_largest]) {
					if(third_largest==-1||arr[i]>arr[third_largest]) {
						third_largest=i;
					}
				}
			}
		}
		return third_largest;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,7,7,7,7,7,7,0};
		System.out.println("Second Largest index : " + secondLargest(arr));
		System.out.println("Third Largest index : " + thirdLargest(arr));

	}

}
