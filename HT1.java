/*
1. Прочитать строку 1
2. Прочитать строку 2
3. Прочитать строку 3
4. Вывести на экран
1. S1 + s3
2. S3 + s2 + s1
3. S1 + s2 + s3*/
import java.util.Scanner;

public class HT1 {

	private static Scanner sc;

	public static void main(String[] args) {
		String s1,s2,s3;
		sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		s2 = sc.nextLine();
		System.out.print("Enter third string: ");
		s3 = sc.nextLine();
		System.out.println("You printed three string: first - " + s1 + " ,second - "+s2+" ,third - "+s3);
		System.out.println("Do our new string!");
		System.out.println("First new string: (s1+s3) - "+s1+" "+s3);
		System.out.println("Second new string: (s3+s2+s1) - "+s3+" "+s2+" "+s1);
		System.out.println("Third new string: (s1+s2+s3) - "+s1+" "+s2+" "+s3);
	}

}
