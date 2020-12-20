import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any int num");
	int ans=sc.nextInt();
System.out.println("factorial of any input number is:" +fact(ans));
	}
	public static int fact(int y)
	{
		int result=1; //initialize variable reslut and assign value 1
		for(int i=1;i<=y;i++)
		{
			result=result*i;
			
		}
		return result;
	}

}
