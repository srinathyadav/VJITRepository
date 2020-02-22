package vjit;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException(String s)
	{
		super(s);
	}
}
public class TestException1 extends Account {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter the age of the person");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		Account a1=new Account();
		a1.setAge(age);
try
{
	if(a1.getAge()<=15)
		throw new UnderAgeException(" only 18+ age are allowed");
	else
		System.out.println("person age is:"+a1.getAge());
}
catch(Exception e)
{
	System.out.println("caught"+e);
	
}
	}

}
