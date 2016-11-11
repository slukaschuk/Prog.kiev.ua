/*Заполнить массив числами от 100 до 0.*/
import java.util.Arrays;
public class HT4_3 {

	public static void main(String[] args) {
		int arr[] = new int[101];
		for(int i=100,j=0;i>=1;i--,j++)
		{
			arr[j]=i;
		}
		System.out.println(Arrays.toString(arr));
	}

}
