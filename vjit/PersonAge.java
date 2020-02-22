package vjit;

import java.time.LocalDate;
import java.time.Period;

public class PersonAge {
	String firstName;
	String lastName;
	String fullName;
	char gender;
	long phoneno;
	
	PersonAge()
	{
		firstName="Srinath";
		lastName="Bolleboina";
		gender='M';
		phoneno=7036096191L;
		
	}
	 PersonAge(String firstName,String lastName,char gender,long phoneno)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.phoneno=phoneno;
	}
	public void calculateage()
	 {
		 LocalDate bday = LocalDate.of(1998, 10, 27);
		 LocalDate now = LocalDate.now();
		 Period diff= Period.between(bday, now);
		 System.out.println("Age of the person:"+diff.getYears()+"years "+diff.getMonths()+"months and"+diff.getDays()+"days");
	 }
	
	 public void display()
	 {
		 	System.out.println("FullName:"+getFullName());
			System.out.println("firstName:"+getFirstName()); 
			System.out.println("lastName:"+getLastName());
			System.out.println("gender:"+getGender());
			System.out.println("phoneno:"+getPhoneno());
			
			
			
			
	 }
	 public String getFullName() {
		 fullName=this.firstName +" "+this.lastName;
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
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

PersonAge p= new PersonAge();
p.display();
p.calculateage();

	}

}
