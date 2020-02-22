package vjit;
import java.util.*; 
//import java.util.Scanner;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		al.add("pen");
		al.add("laptop");
		al.add("apple");
		
		System.out.println("before sorting");
		for(String str: al)
		{
			System.out.println(str);
		}
		Collections.sort(al);
		System.out.println("after sorting");
		for(String str: al)
		{
			System.out.println(str);
		}
			
			
	}

}
