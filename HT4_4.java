/*Дано массив из 10 целых чисел. Вывести на экран
сумму всех его элементов кроме первого и
последнего.*/
public class HT4_4 {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,1,1,1,1,1,1};
		int sum=0;
		for(int i=1;i<9;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}

}
