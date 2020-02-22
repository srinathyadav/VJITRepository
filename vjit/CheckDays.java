package vjit;
import java.time.*;

public class CheckDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate pdate = LocalDate.of(2019, 11, 30);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 System.out.println("years:"+diff.getYears());
 System.out.println("months:"+diff.getMonths());
 System.out.println("days:"+diff.getDays());
	}

}
