package vjit;

public class PersonDetails {
	String firstName;
	String lastName;
	char gender;
	short age;
	double weight;
	
	PersonDetails()
	{
		firstName="Divya";
		lastName="Bharathi";
		gender='F';
		age=20;
		weight=85.55;
	}
	
	public static void main(String[] args) {
		
				PersonDetails pd= new PersonDetails();
				System.out.println("Person");
				System.out.println("......................");
				System.out.println("firstName:"+pd.firstName);
				System.out.println("lastName:"+pd.lastName);
				System.out.println("Gender:"+pd.gender);
				System.out.println("Age:"+pd.age);
				System.out.println("Weight:"+pd.weight);
				
	}

}
