package vjit;
class NoNameException extends Exception{
	NoNameException(String s)
	{
		super(s);
	}
	
}
public class TestException extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("","",'M');
try {
	if(p.firstName=="" && p.lastName=="")
	throw new NoNameException("Blank Name");
	else
		System.out.println(p.firstName+p.lastName);
	
}
	catch(Exception e) {
		System.out.println("caught"+e);
	}


	}
}
