import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		char b=in.next().charAt(0);
		if((b>='a'&&b<='z')||(b>='A'&&b<='z'))
		{ 
			System.out.println("Alphabet");
		}
		else
		{
		System.out.println("NO");	
		}
	}
}
