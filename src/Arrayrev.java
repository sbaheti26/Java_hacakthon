import java.util.Scanner;

public class Arrayrev {

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
		for(int i=0,j=num-1;i<=j;i++,j--) //we r swapping 1st element with last,2nd element with 2nd last..
			
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("array in reverse order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}

/*arr={1,2,3,4,5}
i=0,j=4
temp=1,arr[0]=5,arr[4]=1,
i=1,j=3
temp=2,arr[1]=4,arr[3]=2
i=2,j=2
temp=3,arr[2]=3,arr[2]=3

*/
