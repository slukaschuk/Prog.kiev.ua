/*
 Вывести на экран числа от 10 до 20 с помощью
всех известных циклов.
*/
public class HT4_1 {

	public static void main(String[] args) {
		for(int i=10;i<21;i++)
		{
			System.out.print(" "+(i));
		}
		int i=10;
		System.out.println();
		do{
			System.out.print(" "+(i));
			i++;
		}while(i<21);
		System.out.println();
        i=10;
        while(i<21) 
        {System.out.print(" "+(i));
        
        	i++;
        }
	}

}
