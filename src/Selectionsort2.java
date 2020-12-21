import java.util.Scanner;

public class Selectionsort2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("enter array elemstns");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array numbers are");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int sortedarrindex=0;
		for(int i=0;i<num-1;i++)
		{
			for(int j=sortedarrindex;j<num-1;j++)
			{
				if(arr[sortedarrindex]>arr[j+1])
				{
					int temp=arr[sortedarrindex];
					arr[sortedarrindex]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			sortedarrindex++;
		}
		System.out.println();
		System.out.println("sorted elements");
		
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
