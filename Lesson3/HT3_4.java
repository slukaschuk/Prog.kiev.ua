package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HT3_4 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int [] arr;
		int n = 0, sum = 0;
		sc = new Scanner(System.in);
		System.out.print("Input length of our array - ");
		n = sc.nextInt();
		arr = new int[n];
		for (int i=0; i<arr.length;i++)
		 	{
			 System.out.print("Input "+(i+1)+" numbers - ");
			 arr[i] = sc.nextInt();
			 sum+=arr[i];
		 	}
		System.out.println("Our array - "+ Arrays.toString(arr));
		double avrsum = 0;
		avrsum = (double)sum/n;
		System.out.println("Average sum - "+ avrsum);
		
	}

}
