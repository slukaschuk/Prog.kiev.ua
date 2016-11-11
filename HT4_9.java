import java.util.Scanner;

/*нарисовать ромб, где вводом с консоли мы указываем высоту, число должно быть нечетным = 5
    * 
   *** 
  ***** 
   ***
    *
 */

public class HT4_9 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("¬ведите высоту ромба (число от 3 и нечетное ) - ");
		int n = sc.nextInt();
		if ((n>=3)&(n%2!=0))
		{ 
			char star = '*';
			char space = ' ';
			//верхн€€ часть
			 for(int i=0;i<n/2+1;i++)
			  {
				  for(int p=n/2-i;p>0;p--)
				  { 
					  System.out.print(space);
				  }  
				  for(int j=1;j<2*i+2;j++)
				  {
					System.out.print(star);
				  }
				 System.out.println();
			  }
			//нижн€€ часть
			 for(int i=0;i<n/2;i++)
			  {
				  for(int p=n/2;p<n/2+i+1;p++)
				  { 
					  System.out.print(space);
				  }  
				  for(int j=n;j>2*i+2;j--)
				  {
					System.out.print(star);
				  }
				 System.out.println();
			  }
			 
		}
		else
		{
			System.out.println("¬ведено некорректное число!");
		}
	}
}
