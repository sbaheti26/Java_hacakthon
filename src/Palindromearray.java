import java.util.Scanner;

public class Palindromearray {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter how man numbers in array");
			int num=sc.nextInt();
			int[] arr=new int[num];
			System.out.println("enter array elements");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("printing array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			boolean var=true;
			for(int i=0,j=num-1;i<j;i++,j--)
			{
				if(arr[i]!=arr[j])
					var=false;
				break;
				
			}
			if(var)
			{
			System.out.println("array is palindreom");
			}
			else
				System.out.println("not a palindrome");
			
			
			

	}
	
		
	}


