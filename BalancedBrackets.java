//Checks whether the input string of brackets is balanced or not,
//i.e. each opening bracket has a closing one or not!
import java.util.*;
class BalancedBrackets
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,l,c,n=in.nextInt();
		String str;
		for(;n>0;n--)
		{
			str=in.next();
			l=str.length();c=-1;
			if(l%2!=0)
			{
				System.out.println("NO");
				continue;
			}
			char stack[]=new char[l];
			for(i=0;i<l;i++)
			{
				stack[++c]=str.charAt(i);
				if(stack[c]==41)
				{
					if(c<1)
						break;
					if(stack[c-1]==40)
						c-=2;
				}
				else if(stack[c]==93)
				{
					if(c<1)
						break;
					if(stack[c-1]==91)
						c-=2;
				}
				else if(stack[c]==125)
				{
					if(c<1)
						break;
					if(c>0 && stack[c-1]==123)
						c-=2;
					
				}
			}
			if(c==-1 && i==l)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
