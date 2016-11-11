/*Написать метод, который заполнит массив произвольного размера числами по возрастанию,
начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5].*/

import java.util.Arrays;
import java.util.Scanner;

public class HT4_7 {
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
			{ //введено не четное количество
				arr[arr.length/2+i]=i;
				arr[arr.length/2-i]=i;
				
			}
			
		}
		System.out.println("Our array - "+Arrays.toString(arr));
	}
}
                                