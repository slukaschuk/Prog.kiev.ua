/*
 1. Прочитать с консоли число 1
 2. Прочитать с консоли число 2
 3. Вывести результат
 4. И так для каждого оператора
  */


import java.util.Scanner;

public class HT2 {

	private static Scanner sc;

	public static void main(String[] args) {
		int number1,number2;
		sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		number1 = sc.nextInt();
		System.out.print("Enter second number: ");
		number2 = sc.nextInt();
		System.out.println("Teh sum of the numbers: " + (number1 + number2));
		System.out.println("The difference of numbers: " + (number1 - number2));
		System.out.println("The product numbers: "+ (number1 * number2));
		System.out.println("Divide numbers: "+ (number1 /number2));
		
	}

}
