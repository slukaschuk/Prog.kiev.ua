/*������ � ������� ����. �������� �� � ������� ����� �
�������. ������� ������������ ����� (���, �����) ��
�����. */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HT6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("������� ����");
		String dtstr = sc.nextLine();
		Date dt = new Date();
		try{
			dt = sdf.parse(dtstr);
		}
		catch (ParseException e)
		{
			System.out.println("�������� ����");
		}
		sc.close();
        Calendar ourcal = Calendar.getInstance();
        Calendar syscal = Calendar.getInstance();
        ourcal.setTime(dt);
        System.out.println("��������� ���� - "+dt);
        System.out.println("��������� ���� - "+syscal.getTime());
        int ourcalyear	= ourcal.get(ourcal.YEAR);
        int ourcalmonth	= ourcal.get(ourcal.MONTH);
        int syscalyear  = syscal.get(syscal.YEAR);
        int syscalmonth = syscal.get(syscal.MONTH);
        if (ourcal.compareTo(syscal)==0) 
        {
        	System.out.println("��� ������� � �����");
        }
        else if (ourcal.compareTo(syscal)==-1) 
        {
        	System.out.println("��������� ���� ������ ���������, ������� ������� � ����� � �������");
        	 System.out.println("������� ����� ���������� ������ = "+(syscalyear-ourcalyear));
             System.out.println("������� ����� ���������� �������� = "+(syscalmonth-ourcalmonth));
        }
        else if (ourcal.compareTo(syscal)==1) 
        {
        	System.out.println("��������� ���� ������ ���������, ������� ������� � ����� � �������");
        	 System.out.println("������� ����� ���������� ������ = "+(ourcalyear-syscalyear));
             System.out.println("������� ����� ���������� �������� = "+(ourcalmonth-syscalmonth));
        }
       
	}

}
