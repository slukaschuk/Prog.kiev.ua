package Lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class HT3_2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[] arr;
		int n = 0, tmp = 0;
		sc = new Scanner(System.in);
		System.out.print("Input length of our array - ");
		n = sc.nextInt();
		arr = new int[n];
		for (int i=0; i<arr.length;i++)
		 	{
			 System.out.print("Input "+i+" numbers - ");
			 arr[i] = sc.nextInt(); 
		 	}
		System.out.println("Our array - "+ Arrays.toString(arr));
	//change
	tmp = arr[0];
	arr[0] = arr[n-1];
	arr[n-1] = tmp;
	System.out.println("Our array - "+ Arrays.toString(arr));
	}

}
