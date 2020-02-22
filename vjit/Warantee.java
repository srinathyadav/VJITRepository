package vjit;

import java.time.LocalDate;

public class Warantee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate purchase = LocalDate.of(2019, 11, 30);
		int warantyyear=3;
		int warantymonths=6;
		System.out.println("purchase Date:"+purchase);
		System.out.println("waranty:"+warantyyear+"years and"+warantymonths+"months");
		
		LocalDate s = purchase.plusMonths(warantymonths);
		
		System.out.println("The waranty will expire in:"+s.plusYears(warantyyear));
	}

}
