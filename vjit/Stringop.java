package vjit;

public class Stringop {
	String a;
	String b;
	//Stringop()
	//{
		// a="srinath";
		 // b ="yadav";
	//}
	
	public void Stringconcat()
	{
		 System.out.println(this.a+this.b); 
	}
	public void Stringconcat(String a,String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a+this.b);
	}
	public  void  op2(String a)
	{
		this.a = a;
		
		for(int i=0;i<a.length();i+=2)
		{	a=a.replace(a.charAt(i), '#');
		}
		System.out.println(a);
	}
	public  void  op3(String a)
	{
		this.a = a;
		
		for(int i=0;i<a.length();i+=2)
		{
		char c=a.charAt(i);
		
			char n=Character.toUpperCase(c);
			a=a.replace(a.charAt(i), n);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stringop s=new Stringop();
//System.out.println(s.a+s.b);
s.Stringconcat();
s.op2("srinath");
s.op3("srinath");


s.Stringconcat("sunny", "yadav");
	}
}

