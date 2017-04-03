//Finds the sequences of consecutive nubers that add up to the input number!
import java.util.Scanner;
class ConsequentSum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt(),i,j,s=0,k;
		for(i=1;i<=n/2+1;i++)
		{
			for(j=i;j<=n/2+1;j++)
			{
				s+=j;
				if(s>=n)
					break;
			}
			if(s==n)
			{
				System.out.print("\n"+i);
				for(k=i+1;k<=j;k++)
					System.out.print(" + "+k);
				System.out.println();
			}
			else
				s=0;
		}
	}
}