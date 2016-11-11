import java.util.Arrays;
import java.util.Scanner;

/*
1. Задать массив целых чисел длинной 10 эл.
2. Отсортировать числа в массиве
3. Вывести на экран результат.
4. Сделать возможность наполнения массива с клавиатуры*.
 */

public class HT3_1 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		sc = new Scanner(System.in);
		 for (int i=0; i<arr.length;i++)
	    {
			 System.out.print("Input "+i+" numbers - ");
			 arr[i] = sc.nextInt(); 
	    }
		 Arrays.sort(arr);
		 System.out.println("Sorted array - "+ Arrays.toString(arr));
		}

	}


