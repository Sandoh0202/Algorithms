import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print("1\t1");
		recur(1,1,n-2);
	}
	static void recur(int a,int b,int n)
	{
		if(n<1)
			return;
		else
		{
			int c=a+b;
			System.out.print("\t"+c);
			recur(b,c,--n);
		}
	}
}