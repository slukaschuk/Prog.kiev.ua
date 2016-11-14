package Lesson6_7;

import java.util.Arrays;

/*make your own  Arrays.toString() for int[].*/
public class HT6_5 {
    static String toString(int arr[])
    {   StringBuilder sb = new StringBuilder("[");
    	for(int i=0;i<arr.length;i++)
    	{
    		if (i<arr.length-1){
    		sb.append(arr[i]);sb.append(", ");
    		}
    		else {sb.append(arr[i]);}
    			
    	}
    	sb.append("]");
    	return sb.toString();
    	}
	public static void main(String[] args) {
		
	int [] arr = {3,4,5,6};
	System.out.println(Arrays.toString(arr));
	System.out.println(toString(arr));
	}

}
