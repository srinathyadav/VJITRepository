package vjit;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person("Akhil","Akkaldevi",'M');
		System.out.println("person details");
		System.out.println("firstName:"+p1.getFirstName());
		System.out.println("lastName:"+p1.getLastName());
		System.out.println("gender:"+p1.getGender());
		System.out.println("----------------------");
		Person p2=new Person();
		System.out.println("person details");
		System.out.println("firstName:"+p2.firstName);
		System.out.println("lastName:"+p2.lastName);
		System.out.println("gender:"+p2.gender);
		
	}

}
