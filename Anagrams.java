//Finds all possible anagrams of a string, all of same size.
import java.util.*;
class Anagrams
{  
    void work()
    {
		Scanner in=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=in.next();
        recur("",s);
    }

    void recur(String a, String b)
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
	public static void main(String args[])
	{
		Anagrams o=new Anagrams();
		o.work();
	}
}