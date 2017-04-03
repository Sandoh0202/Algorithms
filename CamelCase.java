//Counts words in a camel case sentence!
import java.util.*;
class CamelCase
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		str+=' ';
		int l=str.length(),i,c=0;
		if(l>0 && l<=100000)
		{
			c++;
			for(i=1;i<l;i++)
			{
				if(str.charAt(i)<='Z' && str.charAt(i)>='A')
					c++;
			}
			System.out.println(c);
		}
	}
}