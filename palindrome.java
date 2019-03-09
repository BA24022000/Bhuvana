import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num,reversedInteger=0,remainder,originalInteger;
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	originalInteger=num;
	while(num!=0)
	{
		remainder=num%10;
		reversedInteger=reversedInteger*10+remainder;
		num=num/10;
	}
if(originalInteger==reversedInteger)
	System.out.println("yes");
else
System.out.println("no");
}
}
