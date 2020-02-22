package vjit;

public class PersonModify {
	String firstName;
	String lastName;
	char gender;
	long phoneno;
	
	PersonModify()
	{
		firstName="Srinath";
		lastName="Bolleboina";
		gender='M';
		phoneno=7036096191L;
		
	}
	 PersonModify(String firstName,String lastName,char gender,long phoneno)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
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
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
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
