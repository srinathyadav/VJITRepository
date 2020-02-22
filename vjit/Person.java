package vjit;

public class Person {
	String firstName;
	String lastName;
	char gender;
	Person()
	{
		firstName="Srinath";
		lastName="Bolleboina";
		gender='M';
		
	}
	 Person(String firstName,String lastName,char gender)
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
	
	public static void main(String[] args) {
		
		
	
	}

}
