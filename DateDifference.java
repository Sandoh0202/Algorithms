//Finds the difference between two dates!
import java.util.*;
class DateDifference
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String date1=in.next(),date2=in.next();
		int d1,m1,y1,d2,m2,y2;
		d1=Integer.parseInt(date1.substring(0,2));
		m1=Integer.parseInt(date1.substring(2,4));
		y1=Integer.parseInt(date1.substring(4));
		d2=Integer.parseInt(date2.substring(0,2));
		m2=Integer.parseInt(date2.substring(2,4));
		y2=Integer.parseInt(date2.substring(4));
		d1 = Math.abs(calc(d1,m1,y1)-calc(d2,m2,y2));
		System.out.println("Number of Days = "+d1);
	}
	static int calc(int d,int m,int y)
	{
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		int days=d;				//Number of days calculated from 01/01/1000
		month[2]=leap(y)==366?29:28;
		while(y>1000)
		{
			y--;
			days+=leap(y);
		}
		while(m>0)
		{
			m--;
			days+=month[m];
		}
		return days;
	}
	static int leap(int y)
	{
		if(y%400==0)
			return 366;
		else if(y%100!=0 && y%4==0)
			return 366;
		else
			return 365;
	}
}