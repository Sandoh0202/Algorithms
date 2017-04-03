import java.util.*;
class EscapeCube
{
	static int c=0;
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter dimension: ");
		int n=in.nextInt();
		rec(0,0,0,n);
		System.out.println("Ways: "+c);
	}
	static void rec(int x,int y,int z,int n)
	{
		if(x==y && y==z && z==n)
			c++;
		if(x<n)
			rec(x+1,y,z,n);
		if(y<n)
			rec(x,y+1,z,n);
		if(z<n)
			rec(x,y,z+1,n);
	}
}