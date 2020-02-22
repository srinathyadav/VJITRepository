package vjit;
import java.util.*;
public class Productarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("no: of products names");
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("before sorting the products are");
   for(int i=0;i<arr.length;i++)
   {
	   System.out.println(arr[i]);
   }
   Arrays.sort(arr);
   System.out.println("after sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}

	}

}
