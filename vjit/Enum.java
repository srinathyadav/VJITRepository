package vjit;

public class Enum {
	String firstName;
	String lastName;
	enum Gender{
		m,f;}
	
	Gender a;
	
	long phoneno;
	
	Enum()
	{
		firstName="Srinath";
		lastName="Bolleboina";
		a=a.m;
		phoneno=7036096191L;
		
	}
	Enum(String firstName,String lastName,Gender a,long phoneno)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.a=a;
		this.phoneno=phoneno;
	}
	
	 public void display()
	 {
			System.out.println("firstName:"+getFirstName());
			System.out.println("lastName:"+getLastName());
			System.out.println("gender:"+getGender());
			System.out.println("phoneno:"+getPhoneno());
			
	 }
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Gender getGender() {
			return a;
		}

		public void setGender(Gender a) {
			this.a = a;
		}
		
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
