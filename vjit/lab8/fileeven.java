package lab8 ;
import java.io.*;
import java.util.Scanner;

public class fileeven {

	public static void main(String[] args) throws IOException {

//		FileWriter fw=new FileWriter("/D:/java capgemini/number.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("/D:/jdbc L8/number.txt"));
		String data = null;
		while((data=br.readLine())!=null)
		{
			Scanner sc=new Scanner(data);
	    	sc.useDelimiter(",");
		
			while(sc.hasNext())
			{
			
				int n = Integer.parseInt(sc.next());
				if(n%2==0)
					System.out.print(n);
			}
			
		}
		
		br.close();
		// fw.close();
		
		 
		
}
}