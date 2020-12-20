import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //importing scanner class to take input for any primitve datatypes
		System.out.println("enetr number of items u want in array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++ )
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("prinitng array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=arr.length/2;j>0;j--)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("srray is palindrome");
				}
				else
				{
					System.out.println("not");
				}
			}
		}
		
		
		}
		
		
		

	}


