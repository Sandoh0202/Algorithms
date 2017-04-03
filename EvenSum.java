import java.util.Scanner;
class EvenSum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt(),i,n,m,c,x,s;
		int arr[]=new int[t];
		for(i=0;i<t;i++)
			arr[i]=in.nextInt();
		for(i=0;i<t;i++)
		{
			n=arr[i];s=0;x=2;
			while(n>0 && n<=100000)
			{
				m=x;c=0;
				while(m>0)
				{
					c+=m%2;
					m/=2;
				}
				if(c==2)
				{
					n--;
					s+=x;
				}	
				x++;
			}
			System.out.println(s);
		}
	}
}