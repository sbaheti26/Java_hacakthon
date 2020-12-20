import java.util.Scanner;

public class Sortedarray {

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
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0; //intialize temporary variable 
				if(arr[i]>arr[j])
				{
					 temp=arr[i]; //we need to swap if  value is greater
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
