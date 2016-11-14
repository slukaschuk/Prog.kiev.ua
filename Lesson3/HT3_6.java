package Lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class HT3_6 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int [] arr;
		int n = 0;
		sc = new Scanner(System.in);
		System.out.print("Input length of our array - ");
		n = sc.nextInt();
		arr = new int[n];
		for (int i=0; i<arr.length;i++)
		 	{
			 System.out.print("Input "+(i+1)+" numbers - ");
			 arr[i] = sc.nextInt();
			 }
		System.out.println("Our array - "+ Arrays.toString(arr));
		System.out.println("Please enter number of position between 0 and "+ (arr.length-1));
		n = sc.nextInt();
		System.out.println("Your choice is - "+arr[n]);
		
	}

}
