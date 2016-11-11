/*Ввести с консоли дату. Сравнить ее с текущей датой в
системе. Вывести отличающиеся части (год, месяц) на
экран. */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HT6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Введите дату");
		String dtstr = sc.nextLine();
		Date dt = new Date();
		try{
			dt = sdf.parse(dtstr);
		}
		catch (ParseException e)
		{
			System.out.println("Неверная дата");
		}
		sc.close();
        Calendar ourcal = Calendar.getInstance();
        Calendar syscal = Calendar.getInstance();
        ourcal.setTime(dt);
        System.out.println("Введенная дата - "+dt);
        System.out.println("Системная дата - "+syscal.getTime());
        int ourcalyear	= ourcal.get(ourcal.YEAR);
        int ourcalmonth	= ourcal.get(ourcal.MONTH);
        int syscalyear  = syscal.get(syscal.YEAR);
        int syscalmonth = syscal.get(syscal.MONTH);
        if (ourcal.compareTo(syscal)==0) 
        {
        	System.out.println("Нет разницы в датах");
        }
        else if (ourcal.compareTo(syscal)==-1) 
        {
        	System.out.println("Системная дата больше введенной, выводим разницу в годах и месяцах");
        	 System.out.println("Разница между введенными годами = "+(syscalyear-ourcalyear));
             System.out.println("Разница между введенными месяцами = "+(syscalmonth-ourcalmonth));
        }
        else if (ourcal.compareTo(syscal)==1) 
        {
        	System.out.println("Системная дата меньше введенной, выводим разницу в годах и месяцах");
        	 System.out.println("Разница между введенными годами = "+(ourcalyear-syscalyear));
             System.out.println("Разница между введенными месяцами = "+(ourcalmonth-syscalmonth));
        }
       
	}

}
