//We all know what Pig-Latin is! Converts a single word into it's Pig-Latin equivalent!
import java.util.*;
class PigLatin
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.next(),pl="";
		int i,l=str.length();
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				pl=(str.substring(i)).concat(pl);
				break;
			}
			else
				pl+=str.charAt(i);
		}
		pl=pl.concat("ay");
		System.out.println("\n"+pl);
	}
}