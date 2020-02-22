package lab8;
import java.io.*;
import java .io.FileWriter;
import java.util.*;
public class filerev {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File n1=new File("/D:/jdbc L8/file.txt");
			n1.createNewFile();
			File n2=new File("/D:/jdbc L8/file1.txt");
			n2.createNewFile();
			FileWriter fw=new FileWriter("/D:/jdbc L8/file.txt");
			Scanner s= new Scanner(System.in);
			String st=s.nextLine(); 
			fw.write(st);
			fw.close();
			FileReader f=new FileReader("/D:/jdbc L8/file.txt");
			FileWriter fw1=new FileWriter("/D:/jdbc L8/file1.txt");
			ArrayList<Character> al=new ArrayList<Character>();
			int c;
			 while((c=f.read())!=-1)
			 {
				al.add((char)c);
				 System.out.print((char)c);
			 }
			 Collections.reverse(al);
			 for(int i:al){
				 
			 
			 fw1.write(i);
			 }
			 fw1.close();
			 FileReader f1=new FileReader("/D:/jdbc L8/file1.txt");
			 int c1; 
			 while((c1=f1.read())!=-1)
			 System.out.print((char) c1);

			 f.close();
			// fw1.close();
			 f1.close();
			 
	}
catch(Exception e)
		{
	System.out.println("error" +e);
		}	
}
}
