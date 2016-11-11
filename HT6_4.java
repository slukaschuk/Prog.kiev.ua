/*Написать свой вариант ф-и Arrays.equals для short[].*/
public class HT6_4 {
static boolean equal(short arr1[], short arr2[])
	{
	if (arr1.length!=arr2.length) {
		return false;
		}
	for(int i=0;i<arr1.length;i++)
	{
		if (arr1[i]!=arr2[i])
			return false;
	}
	return true;
	}
	public static void main(String[] args) {
		short[] arr1 = {1,2,3,4,5};
		short[] arr2 = {2,3,4};
		short[] arr3 = {1,2,3,4,5};
		short[] arr4 = {4,5,3,4,5};
		System.out.println(equal(arr1,arr2));
		System.out.println(equal(arr1,arr3));
		System.out.println(equal(arr1,arr4));
		System.out.println(equal(arr2,arr4));

	}

}
