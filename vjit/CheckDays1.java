package vjit;

import java.time.LocalDate;
import java.time.Period;

public class CheckDays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.of(2019, 11, 30);
        LocalDate now = LocalDate.of(2020,2,10);
 
        Period diff = Period.between(start, now);
 System.out.println("years:"+diff.getYears());
 System.out.println("months:"+diff.getMonths());
 System.out.println("days:"+diff.getDays());
	}

}
