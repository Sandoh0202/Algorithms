import java.util.*;
class CircArray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),k=in.nextInt(),q=in.nextInt(),i,c=0;
		int arr[]=new int[n];
		int sft[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=in.nextInt();
		k%=n;
		for(i=0;i<n;i++)
		{
			c=i+k;
			if(c>=n)
				c-=n;
			sft[c]=arr[i];
		}
		for(i=0;i<q;i++)
		{
			c=in.nextInt();
			System.out.println(sft[c]);
		}
	}
}