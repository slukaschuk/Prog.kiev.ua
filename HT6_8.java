import java.util.Scanner;

/*������ � ������� ����� �����. ��������� ����������
������ � ��� �������� ������������� (�1011� �> 3).*/
public class HT6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �����");
		int n = sc.nextInt();
		System.out.println("��������� ����� - "+n);
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
	
		System.out.println("���������� ������ � �������� ������������� - "+x+" ����� � �������� "+str.reverse());
		sc.close();

	}

}
