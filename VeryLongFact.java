//Calculates factorial of any number, regardless of magnitude!
import java.util.*;
class VeryLongFact
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		rec("1",n);
	}
	static void rec(String str,int n)
	{
		if(n==1)
			System.out.println("Factorial - "+str);
		else
		{
			String temp="";
			int i=str.length()-1,x,car=0;
			for(;i>=0;i--)
			{
				x=str.charAt(i)-48;
				x*=n;x+=car;
				temp=(char)((x%10)+48)+temp;
				car=x/10;
			}
			if(car!=0)
				temp=(char)(car+48)+temp;
			str=temp;n--;
			rec(str,n);
		}
	}
}