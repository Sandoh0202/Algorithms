//Single algorithmic solution to the N-Queen problem, for all even inputs except 0
import java.util.*;
class EvenNQueenSolution
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),i=n/2-1,j=0,c=n/2;
		int arr[][]=new int[n][n];
		if(n%2==0 && n!=0)
		{
			while(i<n && j<n)
			{
				arr[i][j]=1;
				arr[n-i-1][n-j-1]=1;
				i+=2;j++;c--;
			}i-=3;j++;
			while(c>0)
			{
				arr[i][j]=1;
				arr[n-i-1][n-j-1]=1;
				i--;j+=2;c--;
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(arr[i][j]==1)
						System.out.print("Q\t");
					else
						System.out.print("-\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Incorrect Input!!!");
	}
}