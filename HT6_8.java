import java.util.Scanner;

/*¬вести с консоли целое число. ѕосчитать количество
единиц в его бинарном представлении (У1011Ф Ц> 3).*/
public class HT6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите челое число");
		int n = sc.nextInt();
		System.out.println("¬веденное число - "+n);
		int x = 0;
		StringBuilder str= new StringBuilder();
		while(n!=0)
		{
			if (n%2>0)
			{x++;
			str.append('1');
			}
			else {str.append('0');}
		n/=2;	
		}
	
		System.out.println(" оличество единиц в бинарном представлении - "+x+" число в бинарном "+str.reverse());
		sc.close();

	}

}
