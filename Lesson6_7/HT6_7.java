package Lesson6_7;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*translation from decimal to binary*/
public class HT6_7 {
   public static int strtobit(String str){
	   int result = 0;
	   for (int i=0; i<str.length();i++){
		   result += Math.pow(2, i) * (str.charAt(i) == '1' ? 1 : 0);

	   }
	return result;
	   
   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String str = sc.nextLine();
		System.out.println(str);
		byte[] ms = str.getBytes();
		System.out.println(Arrays.toString(ms));
		System.out.println(strtobit(str));
		sc.close();
	}

}
