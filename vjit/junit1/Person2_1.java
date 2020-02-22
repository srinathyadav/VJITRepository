package junit1;

public class Person2_1 {
	String firstName;
	String lastName;
	char gender;
	Person2_1()
	{
		firstName="Srinath";
		lastName="Bolleboina";
		gender='M';
				
	}
	 Person2_1(String firstName,String lastName,char gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
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
	public void display()
	{
		System.out.println("firstname:"+this.firstName);
		System.out.println("lastname:"+this.lastName);
		System.out.println("gender:"+this.gender);
	}
	public static void main(String[] args)
	{
		//Person2_1 p=new Person2_1("srinath","yadav",'M');
		//Person2_1 p1=new Person2_1();
		//p.display();
		
	}
}
