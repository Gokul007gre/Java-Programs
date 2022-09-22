/*
  Write a Java program to print the sum of the series  
1-22+333-4444+ … upto n terms  (without using string functions)
*/
import java.util.*;
class Sum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms in the series: ");
		int n=sc.nextInt();
		int sum=0;
		int sign=1;				
		for(int i=1;i<=n;i++){
	      int term=0;	
		    for(int j=0;j<i;j++){
		             term+=i*Math.pow(10,j);
	       }
			term*=sign;
			sum+=term;
			sign=sign*(-1);
		}
		System.out.println(sum);
	}	
}      	
