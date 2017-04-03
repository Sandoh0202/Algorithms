import java.util.*;
class AnagramsAllSizes
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=in.next(),temp="";
		int i,l=str.length(),j,k,t;
		for(i=1;i<=l;i++)						//Size of the substring
		{
			for(j=0;j<l;j++)					//Loop for starting of each substring!
			{
				temp="";
				for(k=0;k<i;k++)				//Loop to set the substring itself!
				{
					t=(j+k)%l;
					temp+=str.charAt(t);
				}
				recur("",temp);
			}
		}
		System.out.println("\n\nDone!");
	}
	static void recur(String a, String b)
    {
        if (b.length()<=1)
            System.out.print("\n"+a+b);          //When second part of anagram is blank, the generated anagram is printed
        else
        {
            for (int i=0;i<b.length();i++)       //Loop to run till the complete anagram is printed
            {
                String str=b.substring(0,i)+b.substring(i+1);
                recur(a+b.charAt(i),str);
            } 
        }
    }
}