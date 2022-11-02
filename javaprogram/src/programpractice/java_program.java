package programpractice;


public class java_program
{
	public static void main(String[] args) 
	{
		
		/*
		//No.8 sum of digits in a number
		int j=789654;
		
		int count6=0;
		while (j>0)
		{
			count6=count6+j%10;
			j=j/10;
		}		
		
	System.out.println(count6);
		*/
	
		/*
		//N0.7 Count no of digits in a Number
		int i1=123654987;
		
		int count5=0;
		while(i1>0)
		{
			i1=i1/10;
			count5++;
		}
		
		System.out.println(count5);
		
		*/
		
		
		
		/*
		//No.6 Count number of even and odd digits ina number
		int o=4569287;
		int w=0;
		int counte=0;
		int counto=0;
		while (o>0) 
		{
			w=o%10;    
			if(w%2==0)
			{
				counte++;
			}
			else
			{
				counto++;
			}	
			o=o/10;
			
		}
		System.out.println(counte++);
		System.out.println(counto++);
		*/
		
		
		
		/*
		// No.5 Reverse a Number Method 01
		int p1=56;
		int k1=65;
		p1=k1+p1;
		k1=p1-k1;
		p1=p1-k1;
		
		System.out.println("P1 Value is :"+p1);
		System.out.println("K1 Value is :"+k1);

		
		// Method 02
		int p=56;
		
		int k=65;
		
		int z;
		z=p;
		p=k;
		k=z;
		
		System.out.println("P value is:"+p);
		
		System.out.println("K value is:"+k);
		*/
		
		
		
		/*
		//N0.4 Palindrome String
		
		String L="MOM";
		String m1="";
		for (int i =2; i>=0; i--) 
		{
			m1=m1+L.charAt(i);//MOM
			//m1=MOM
		}
		if(m1.equals(L))   //m1==L
			System.out.println(L+" :It is a palindrome String");
		else
			System.out.println(L+" :It is not a palindrome String");	
		
		*/	
		
		
		
		
		
		/*
		//No.3 Palindrome Number
		String n="141";
		String m="";
		for (int i =2; i>=0; i--) 
		{
			m=m+n.charAt(i);
		}
		if(m.equals(n))
			System.out.println(n+ ":It is a palindrome Number");
		else
		   System.out.println(n+" :It is not a palindrome number");
		*/
		
		
		
		//No.2 Find the largest of three number
		//Scanner m=new Scanner(System.in);
		//System.out.println("Enter A B C ");
		
		int a=100;
		int b=58;
		int c=65;
 
     //    (a>b &&  a>c)     (b>a  && b>c)
		//  F   &&   F        T       F
       if(a>b && a>c)//False
       {
			System.out.println("A is the Greatest: "+a );
       }
		else if(b>a && b>c)
		{
		   System.out.println("B is the Greatest: "+b);
		}
		else
			System.out.println("C is the Greatest: "+c);
		
		
		//Using Ternary Operator
		int l=(a>b?a:b);//100
			
		
		int l1=(c>l?c:l);   // 65>100?65:100
		
		System.out.println(l1+" Is the largest Number");
		
		
		
		
	
		 //  No.1  Check given no is prime or not 
		  
		//Scanner y= new Scanner(System.in);
		//System.out.println("Enter Number:");
		
		
		int count=0;
		int h=6;
		
		// 
		if(h>1)
		{
			for (int i =1; i<=h; i++)
			{
				if(h%i==0)
				{
					count++; // 1 2 3 4
				}
			}
		}
		
		if (count==2)
			System.out.println("Given Number is Prime Number:"+h);
			
		else
			System.out.println("Given Number is Not a Prime Number:"+h);
	}

}
