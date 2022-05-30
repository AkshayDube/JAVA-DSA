import java.util.*;
public class Concept{
    public static void main(String[] args){
    	//Easiest way to create List
    	List<String> newlist=List.of("Akshay","Aman","Ankur","Anzar","Nityanand");
    	newlist.forEach(element->System.out.print(element + " "));
    	
        //Convert Array to List
        Integer[] array={10,20,30,40,50,60,70,80,90,100};
        List<Integer> list=new ArrayList<>(Arrays.asList(array));
        list.forEach(e->{System.out.print(e+" ");});//for printing purpose only

        //Convert List to Array
        List<Float> lfloat=new ArrayList<>(Arrays.asList(1.1f,1.2f,1.3f));
        Float[] farray=new Float[lfloat.size()];
        farray=lfloat.toArray(farray);
        System.out.println("\nArray is : "+Arrays.toString(farray));//for printing purpose only
    }
}