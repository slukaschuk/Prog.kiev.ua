package Lesson3;

import java.util.Arrays;

public class HT3_5 {
		public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		int tmp = 0;
		System.out.println("Our array - "+ Arrays.toString(arr));	
        for(int i=0;i<2;i++)
        {
        tmp=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i] = tmp;
        }
        System.out.println("Our array - "+ Arrays.toString(arr));
	}

}
