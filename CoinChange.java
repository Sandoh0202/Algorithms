import java.io.*;
import java.util.*;

class Work
{
    public int amount,n,count,val;
    public Work()
    {
        count=val=0;
    }
    public void starting()
    {
        Scanner in=new Scanner(System.in);
        amount = in.nextInt();
        n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        recur(arr);
		System.out.println(count);
    }
    void recur(int arr[])
    {
		for(int i=0;i<n;i++)
        {
            val+=arr[i];
            if(val<amount)
                recur(arr);
            else if (val==amount)
				count++;
            else
				return; 
        }
    }
}
public class CoinChange
{
    public static void main(String[] args)
    {
        Work o=new Work();
        o.starting();
    }
}