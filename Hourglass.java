import java.util.*;
class Hourglass
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int arr[][]=new int[6][6];
		int i,j,sum=0,max=0;
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
				arr[i][j]=in.nextInt();
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(i==0 && j==0)
					max=sum;
				else if(sum>max)
					max=sum;
			}
		}
		System.out.println(max);
	}
}