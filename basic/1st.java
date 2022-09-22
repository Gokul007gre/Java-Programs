/*
Write a Java program to read the number of students, ‘n’ as input from the user. For the ‘n’ students, the user may input either his registration number (an integer), name (String) or CGPA (float), randomly. The names may have multiple parts. Read those inputs and display the following.
i)Count of the registration numbers, count of the CGPA and count of the names
ii)Average of all the cgpa values entered 
iii)The least and the greatest registration number entered so far
iv)a single string that concatenates all the names with a comma between them.
*/
import java.util.*;

class Transaction
{
	public static void main(String [] args)
	{
		int i;		
		
		for(i=0;i<args.length;i+=3)
		{
			String name=args[i];
			float tot=Float.parseFloat(args[i+1]);
			float trans=Float.parseFloat(args[i+2]);
			boolean flag=true;			
			if(trans>0)
			{
				tot+=trans;
			}
			else 
			{				
				if(Math.abs(trans)>tot)
				{
					flag=false;
				}
			              else if(Math.abs(trans)>25000)
				{
					flag=false;
				}
				else
				{
					tot+=trans;
					trans=Math.abs(trans);
					if(trans<=500)
					{
						tot-=5;
					}
          else if(trans<=1000)
					{
						tot-=8;
					}
					else if(trans<=5000)
					{
						tot-=10;
					}
					else if( trans<=15000)
					{
						tot-=12;
					}
					else
					{
						tot-=15;
					}
                                                       }
              		           }  
			System.out.println(name);
			if (flag==false)
			{
			   System.out.println("Failed transanction");
		    }
			System.out.println(tot);				
		}
	}
}
