package Lesson6_7;

import java.util.Arrays;

/*binary operations int.*/
public class HT6_6 {
	 static int setBit(int x, int pos)
	   {
		   return x|(1<<pos);
	   }
	   static int unsetBit(int x, int pos)
	   {
		   return x&~(1<<pos);
	   }
	   static boolean isBitSet(int x, int pos)
	   {
		   return (x&(1<<pos))!=0;
	   }
	   
	   static void setBit(int arr[], int pos)
	   {
		   int intN = arr.length - (pos/32)-1;
		   int bitN = pos%32;
		   arr[intN] = setBit(arr[intN],bitN);
	   }
	   static boolean isBitSet(int arr[], int pos)
	   {
		   int intN = arr.length - (pos/32)-1;
		   int bitN = pos%32;
		   return isBitSet(arr[intN],bitN);
	   }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		setBit(arr,1);
		System.out.println(Arrays.toString(arr));
		System.out.println(isBitSet(arr,12));
	}

}
