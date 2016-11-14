package Lesson6_7;
import java.util.*;
public class HT6_1 {
    static public int factr(int n)
    {  int f=1;
	   if ((n==0) || (n==1))
	   { return f;}
	   else {
		   f=n*factr(n-1);
	   	return f;
	   }
    }
    
    static public int fact(int n)
	{  int f = 1;
	   if ((n==0) || (n==1))
	   { return f;}
	   else {
		 for (int i=2;i<=n;i++)
		 {f=f*i;} 
	   }	   
       return f;
	}
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Inpu number - ");
		int n = sc.nextInt();
		System.out.println("factorial simple= "+fact(n));
		System.out.print("factorial computed recursively  = "+factr(n));
	}

}
