package vjit;
import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneId1 {
	public static void find(String s)
	{
		ZonedDateTime d= ZonedDateTime.now(ZoneId.of(s));
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
find(s);

	}

}
