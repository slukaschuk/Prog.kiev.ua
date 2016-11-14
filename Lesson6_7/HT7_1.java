package Lesson6_7;

import java.util.*;


public class HT7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		  arr[i]=(int)(Math.random()*6+1);
		}
		System.out.println("Your numbers - "+Arrays.toString(arr));
		sc.close();

		int tmp=0,tmp1=0,sum=0, sumtmp=0;

  		Arrays.sort(arr);
  		for(int i=0;i<arr.length;i++)
        { tmp=arr[i];
          if(i==0){
        	  tmp1=tmp;
        	  sum+=arr[i];
        	  }
          if (i>0)
          {
        	  if(tmp==arr[i-1])
        	  {sum+=arr[i];}

            else if(tmp!=arr[i-1])
             {
        	  if (true)
        	  {  
        	     tmp1 = arr[i-1];
        	     sumtmp=sum;
        	     sum=arr[i];
              }
          	}  
          }
        }
		//-----------------------------------------------------
  		System.out.println("max - "+tmp1+" sum- "+sumtmp);
	}

}
