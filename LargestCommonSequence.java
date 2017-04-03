//Displays the largest common sequence (even if discontinuous) between two strings!
import java.util.Scanner;
class LargestCommonSequence
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine(),str2=in.nextLine(),seq="",cseq="";
		int l1=str1.length(),l2=str2.length(),i,j,k,m=0,max=0;
		
		for(i=0;i<l1;i++)
		{
			m=0;
			for(j=i;j<l1;j++)
			{
				for(k=m;k<l2;k++)
				{
					if(str1.charAt(j)==str2.charAt(k))
					{
						seq+=str1.charAt(j);
						m=k;
						break;
					}	
				}
			}
			if(seq.length()>max)
			{
				cseq=seq;
				max=seq.length();
			}
			seq="";
		}
		System.out.println("\n"+cseq);
	}
}