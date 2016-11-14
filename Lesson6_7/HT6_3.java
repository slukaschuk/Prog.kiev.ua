package Lesson6_7;/*������ � ������� ����. �������� �� � ������� ����� �
�������. ������� ������������ ����� (���, �����) ��
�����. */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HT6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Input date");
		String dtstr = sc.nextLine();
		Date dt = new Date();
		try{
			dt = sdf.parse(dtstr);
		}
		catch (ParseException e)
		{
			System.out.println("Input string error");
		}
		sc.close();
        Calendar ourcal = Calendar.getInstance();
        Calendar syscal = Calendar.getInstance();
        ourcal.setTime(dt);
        System.out.println("the input date is - "+dt);
        System.out.println("the system date is - "+syscal.getTime());
        int ourcalyear	= ourcal.get(ourcal.YEAR);
        int ourcalmonth	= ourcal.get(ourcal.MONTH);
        int syscalyear  = syscal.get(syscal.YEAR);
        int syscalmonth = syscal.get(syscal.MONTH);
        if (ourcal.compareTo(syscal)==0) 
        {
        	System.out.println("the date equal to each other");
        }
        else if (ourcal.compareTo(syscal)==-1) 
        {
        	System.out.println("the difference between the dates of");
        	 System.out.println("years = "+(syscalyear-ourcalyear));
             System.out.println("months = "+(syscalmonth-ourcalmonth));
        }
        else if (ourcal.compareTo(syscal)==1) 
        {
        	System.out.println("the difference between the dates of");
        	 System.out.println("years = "+(ourcalyear-syscalyear));
             System.out.println("months= "+(ourcalmonth-syscalmonth));
        }
       
	}

}
