import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		
		System.out.println(pali( str));
		System.out.println("enter any number");
		int num2=sc.nextInt();
		System.out.println(pali(num2));
		

	}
	
	public static boolean pali(String y)
	{
		//int rev=0;
		String rev1="";
	for(int i=y.length()-1;i>=0;i--)   //if str=shraddha, len=8
	{
		rev1=rev1+y.charAt(i);
	}
		if(y.equals(rev1))
		{
			System.out.println("given string is palindrome");
			return true;
		}
		else
		{
		return false;
		}
		
	}
	



public static boolean pali(int num)
{
	int sum=0,r;

	while(num>0)
	{
		r=num%10; //getting remainder eg..if num=464..r=4...r=6 r=4
		sum=(sum*10)+r;//sum=4..46..464
		num=num/10; //num=46..4..
	}
	if(num==sum)
	{
		System.out.println("number is palindrome");
		return true;
		
	}
	else
	{
	
	return false;
	}


}
}
