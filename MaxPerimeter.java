import java.io.*;
class MaxPerimeter
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine()),m=0,c=0,i;
		String str=in.readLine();
		int stick[]=new int[n];
		str+=' ';
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				stick[c++]=m;
				m=0;
			}	
			else
				m=(m*10)+(str.charAt(i)-48);
		}
		for(i=0;i<n;i++)
		{
			c=i;
			for(j=i+1;j<n;j++)
			{
				if(stick[j]>stick[c])
					c=j;
			}
			m=stick[c];
			stick[c]=stick[i];
			stick[i]=m;
		}
		
	}
}