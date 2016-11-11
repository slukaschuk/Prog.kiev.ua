/*Найти в массиве чисел элементы с наибольшим и
наименьшим значениями.*/
public class HT4_5 {

	public static void main(String[] args) {
		int arr[] = {2,3,2,5,4,5,4,67,88,1,4,3};
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i:arr)
		{
			max = (max>i)?max:i;
			min = (min<i)?min:i;
		}
		System.out.println("Max = "+ max + " Min = "+min);
	}

}
