package Lesson4_5;

import java.util.Scanner;

/*draw 4
         * 
        *** 
       ***** 
      ******* 
  */
public class HT5_3 {
 public static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		System.out.print("Input number - ");
		int n = sc.nextInt();
		if (n>0)
		{ char star = '*';
		  char space = ' ';
		  for(int i=0;i<n;i++)
		  {
			  for(int m=n-i-1;m>0;m--)
			  { 
				  System.out.print(space);
			  }  
			  for(int j=1;j<(i*2)+2;j++)
			  {
				System.out.print(star);
			  }
			 System.out.println();
		  }
		}
	}

}
