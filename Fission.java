import java.util.*;
class Fission
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),x=in.nextInt(),p=in.nextInt(),c=0;
		n*=x;
		while(true)
		{
			c++;
			n-=p;
			if(n<0)
				break;
			n*=x;
		}
		System.out.println(c);
	}
}