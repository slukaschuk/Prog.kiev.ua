/*1. Ввести с клавиатуры массив из 10 чисел.
2. Разбить его на 2 массива равной длины.
3. Отсортировать каждую из половинок и вывести их содержимое на экран.*/
import java.util.Arrays;
import java.util.Scanner;

public class HT3_3 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[] arr, newarr1, newarr2;
		int n = 10;
		sc = new Scanner(System.in);
		arr = new int[n];
		for (int i=0; i<arr.length;i++)
		 	{
			 System.out.print("Input "+(i+1)+" numbers - ");
			 arr[i] = sc.nextInt(); 
		 	}
		System.out.println("Our array - "+ Arrays.toString(arr));
		newarr1 = Arrays.copyOf(arr, arr.length/2);
		newarr2 = Arrays.copyOfRange(arr,arr.length/2,arr.length);
		System.out.println("First array - "+ Arrays.toString(newarr1));
		System.out.println("Second array - "+ Arrays.toString(newarr2));
		Arrays.sort(newarr1);
		Arrays.sort(newarr2);
		System.out.println("Sorted first array - "+ Arrays.toString(newarr1));
		System.out.println("Sorted second array - "+ Arrays.toString(newarr2));
	}


}
