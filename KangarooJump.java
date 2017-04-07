import java.util.*;
class KangarooJump
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x1=in.nextInt(),v1=in.nextInt(),x2=in.nextInt(),v2=in.nextInt(),i,c=0;
		if(v2<v1)
		{
			for(i=0;;i++)
			{
				x1+=v1;
				x2+=v2;
				if(x1==x2)
					c=1;
				if(x1>x2)
					break;
			}
		}
		if(c==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}