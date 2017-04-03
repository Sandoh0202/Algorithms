import java.util.Scanner;
class DoubleAndAddOne
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		int i,j,n=str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')
				break;
		}
		n=Integer.parseInt(str.substring(0,i));
		i=Integer.parseInt(str.substring(i+1));
		if(n>2 && n<=100000 && i>1 && i<=10)
		{
			for(j=2;j<=n;j++)
				check(j,i);
		}
	}
	static void check(int a,int i)
	{
		int j,p=0;
		if(prime(a))
		{
			p=a;
			for(j=0;j<i;j++)
			{
				p=2*p+1;
				if(prime(p)==false)
					break;
			}
			if(j==i)
				System.out.print(a+" ");
		}
	}
	static boolean prime(int a)
	{
		int i=2;
		for(;i<a;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
}