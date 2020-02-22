package junit1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPerson2_1 {
@Test
public void getFirstName() {
	Person2_1 p = new Person2_1("srinath","yadav",'M');
	assertEquals("srinath",p.getFirstName());
}
@Test
public void getLastName() {
	Person2_1 p = new Person2_1("srinath","yadav",'M');
	assertEquals("yadav",p.getLastName());
}
@Test
public void getGender() {
	Person2_1 p = new Person2_1("srinath","yadav",'M');
	assertEquals('M',p.getGender());
	Person2_1 p1 = new Person2_1();
	assertEquals('M',p1.gender);
	
}
@Test
public void display()
{
	Person2_1 p1 = new Person2_1();
	assertEquals("Srinath",p1.firstName);
	assertEquals("Bolleboina",p1.lastName);
	assertEquals('M',p1.gender);
}
}
