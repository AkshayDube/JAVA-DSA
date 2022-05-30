//Write a program to find the frequency of each word in input string
package Hashing;
import java.util.*;

import com.sun.jdi.Value;
public class WordFrequency {

	public static void main(String[] args) {
		// Take User Input for String
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : " );
		String string=sc.nextLine();
		
		//Main work A.T.Q.
		Map<String,Integer> map=new HashMap<>();
		String[] array=string.split(" ");
		for(String i:array){
			map.put(i,map.getOrDefault(i,0)+1);
		}
		
		//System.out.println(map);One way to print
		//Second way to print
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
//		//Third Way to print
//		map.forEach((key,value)->System.out.print("\n"+key + " " + value));
		
	}

}
