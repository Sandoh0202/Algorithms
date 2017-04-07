import java.util.*;
class DivPairs
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),k=in.nextInt(),i,j,c=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if((arr[i]+arr[j])%k==0)
					c++;
			}
		}
		System.out.println(c);
	}
}