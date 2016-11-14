package Lesson4_5;

import java.util.Arrays;
import java.util.Scanner;

public class HT5_2 {
	private static Scanner sc;
	public static void main(String[] args) {
		int[] arr;
		int n = 0, x;
		sc = new Scanner(System.in);
		System.out.print("Input length of our array - ");
		n = sc.nextInt();
		arr = new int[n];
		x= (n%2==0)?0:1;
		
		for(int i=0;i<arr.length/2+x;i++)
		{
			if (x==0)
			{
			arr[arr.length/2+i]=i+1;
			arr[arr.length/2-1-i]=i+1;
			}
			else
			{
				arr[arr.length/2+i]=i;
				arr[arr.length/2-i]=i;
				
			}
			
		}
		System.out.println("Our array - "+Arrays.toString(arr));
	}
}
                                