import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Occurencearray {

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
		HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hp.containsKey(arr[i]))
				hp.put(arr[i], hp.get(arr[i])+1);
			else
				hp.put(arr[i], 1);
		}
		System.out.println("unquie value in array"+hp.keySet());
		for (Map.Entry<Integer, Integer> i : hp.entrySet()) {
			System.out.println(i.getKey() + " "+ i.getValue());
			
		}
		
		
	}

}
