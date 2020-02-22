package vjit;

import java.util.Arrays;

public class CheckString {
	static String s="srinath";
static char c;
public static boolean check(String s)
{
	
	int n=s.length();
	char c[]=new char[n];
	for(int i=0;i<n;i++)
	{
		c[i]=s.charAt(i);
	
	}
	Arrays.sort(c);
	for(int i=0;i<n;i++)
	{
	if( c[i]!=s.charAt(i))
			 return false;
	}
		return true;
	}
public static void main(String[] args) {
		
if (check(s))
	System.out.println("Positive String");
else
	System.out.println("Negative String");
	}

}

