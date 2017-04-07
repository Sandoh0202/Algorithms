import java.util.*;
class CompTriplets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();str+=' ';
		int a[]=new int[3];
		int b[]=new int[3];
		int i,m=0,c;
		for(i=0,c=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				a[c++]=m;
				m=0;
			}	
			else
				m=(m*10)+(str.charAt(i)-48);
		}
		str=in.nextLine();str+=' ';
		for(i=0,c=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				b[c++]=m;
				m=0;
			}	
			else
				m=(m*10)+(str.charAt(i)-48);
		}
		m=0;c=0;
		for(i=0;i<3;i++)
		{
			if(a[i]>100 || b[i]>100 || a[i]<1 || b[i]<1)
				break;
			if(a[i]>b[i])
				c++;
			else if(b[i]>a[i])
				m++;
		}
		if(i==3)
			System.out.println(c+" "+m);
	}
}
