//Calculates number of "010" sequences in code including of overlaps!
import java.util.*;
class BeautifulBinary
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
		int l=in.nextInt(),i,c=0;
        String str=in.next(), test="";
        for(i=0;i<l-2;i++)
        {
            test=str.substring(i,i+3);
            if(test.equals("010")==true)
				c++;
        }
        System.out.println(c);
    }
}