import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String str=sc.next();
		
		System.out.println("duplicate characters:");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					
					System.out.println(str.charAt(i));
				}
					
			}
			
		}
		
	}

}
