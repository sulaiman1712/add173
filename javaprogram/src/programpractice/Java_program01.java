package programpractice;

public class Java_program01 
{
	public static void main(String[] args) 
	{
/*
		//Check Given No is Prime Or Not
		int a=5;
		int count=0;
		if (a>1)
		{
			for (int i = 1; i <=a; i++)
			{
				if (a%i==0)
				{
					count++;
				}
			}
			
		}
		
		if (count==2)
		{
			System.out.println("Given no is Prime Number:"+a);
		}
		else
		{
			System.out.println(":Given no is NOT a Prime Number");
		}
*/
		
		
		
		
/*
		//Find the largest of three number
		int x=115;
		int y=2576;
		int z=352;
		
		if (x>y && x>z)
		{
			System.out.println("x is the Largest Number:"+x);
		}
		else if (y>x && y>z)
		{
			System.out.println("Y is the Largest Number:"+y);
		}
		else
		{
			System.out.println("Z is the Largest Number:"+z);
		}
*/
		
		
		
 /******************************************************************************************
 
		//       DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT
//	     DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT DOUBT
		
		// Count Sum of Digits in a Number
		
		String p="12345";
		int v=0;
		int count8=0;

		for (int i = p.length()-1; i >=0 ; i--) 
		{
			v=v + p.charAt(i); 
			count8++;
		}
		System.out.println(v);
		System.out.println(count8);
		
	///////////////////////////////////////////////////////////////////////////////
*/	
		
/*		
	   //Count Number Even And Odd Number In a Number	

		String q="12345";
		
		int even=0;
        int odd=0;
		
		for (int i = q.length()-1; i >=0 ; i--) 
		{
			if ((q.charAt(i))%2==0) 
			{
				even++;
			}
			else
			{
				odd++;
			}
		
		}
		System.out.println("No of Even Number in a Number: " + even);
		System.out.println("No of Odd  Number in a Number: " + odd);
*/	

		
// count number of digits in a number
		
		
		String l="12345";
		int count7=0;

		for (int i = l.length()-1; i >=0 ; i--) 
		{
			count7++;
		}
		System.out.println(count7);
		
		
		
		
		

	}

}
