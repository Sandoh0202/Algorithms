//Pattern of boxes of increasing sizes with a common vertex.
import java.util.Scanner;
class BoxInBox
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),i,j=1;
		n=n*2+1;
		for(i=0;i<n;i++)
			System.out.print("*");
		for(i=2;i<=n;i++)
		{
			j=2;
			System.out.print("\n*");
			if(i%2!=0)
			{
				for(;j<=i;j++)
					System.out.print("*");
			}
			for(;j<=n;j++)
			{
				if(j%2!=0 && j>i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}
}