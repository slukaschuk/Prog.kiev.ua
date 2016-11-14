package Lesson6_7;

import java.util.Scanner;

/*Enter an integer from the console. Count the number of units in its binary representation.(1011 > 3).*/
public class HT6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int n = sc.nextInt();
		System.out.println("Yor number is - "+n);
		int x = 0;
		StringBuilder str= new StringBuilder();
		while(n!=0)
		{
			if (n%2>0)
			{x++;
			str.append('1');
			}
			else {str.append('0');}
		n/=2;	
		}
	
		System.out.println("In your number present - "+x+" '1' and in binary it's look like "+str.reverse());
		sc.close();

	}

}
