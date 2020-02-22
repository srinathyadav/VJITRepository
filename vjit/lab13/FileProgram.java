package lab13;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram extends Thread 
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fi = new FileReader("D:/jdbc L8/source.txt");
		FileWriter fw = new FileWriter("D:/jdbc L8/target.txt");
		CopyDataThread c = new CopyDataThread(fi,fw);
	}
}
