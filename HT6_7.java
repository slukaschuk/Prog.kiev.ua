import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*¬вести с консоли число в бинарном формате. ѕеревести
его в int и вывести на экран (У10Ф -> 2).*/
public class HT6_7 {
   public static int strtobit(String str){
	   int result = 0;
	   for (int i=0; i<str.length();i++){
		   result += Math.pow(2, i) * (str.charAt(i) == '1' ? 1 : 0);
		  //System.out.print(str.charAt(i)=='1'); 
	   }
	return result;
	   
   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число в бинарном виде");
		String str = sc.nextLine();
		System.out.println(str);
		byte[] ms = str.getBytes();
		System.out.println(Arrays.toString(ms));
		//Integer.
		System.out.println(strtobit(str));
		sc.close();
	/*int[] a = new int[] {1,2,2,3};
	String s = " 1234%d89%d0 ";
	s = String.format(s, 0, 1);

	System.out.println(s);
*/
	}

}
