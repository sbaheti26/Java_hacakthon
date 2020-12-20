import java.util.Scanner;

public class Factusingrec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any int num");
		int ans=sc.nextInt();
		System.out.println(fact(ans));
		

	}
	public static int fact(int num)
	{
		int result=1;;
		if(num==1)
			
		return 1;
		else
		{
			result=fact(num-1)*num;
		
	}
		return result;
	}
}


