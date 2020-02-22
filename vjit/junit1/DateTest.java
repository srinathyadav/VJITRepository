package junit1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void setMonth()	
	{
		Date d=new Date(27,10,1998);
		assertEquals(10,d.getMonth());
	}
	@Test
	public void setDay()	
	{
		Date d=new Date(27,10,1998);
		assertEquals(27,d.getDay());
	}
	@Test
	public void setYear()
	{
		Date d=new Date(27,10,1998);
		assertEquals(1998,d.getYear());
	}
	@Test
	public void getMonth( )
	{
		Date d=new Date(27,10,1998);
		assertEquals(10,d.getMonth());
	}
	@Test
	public void getDay()
	{
		Date d=new Date(27,10,1998);
		assertEquals(27,d.getDay());
	}
	@Test
	public void getYear()
	{
		Date d=new Date(27,10,1998);
		assertEquals(1998,d.getYear());
	}
}
