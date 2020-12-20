

public class Selection {

	
		public void NewSelectionSort(int arr[])
		{
			int n = arr.length;
			int SortedArrayIndex= 0;
			for (int i=0; i< n-1; i++)
			{
				for (int j=SortedArrayIndex;j<n-1;j++)
				{
					if (arr[SortedArrayIndex] > arr[j+1] )
					{
						int temp=arr[SortedArrayIndex];
						arr[SortedArrayIndex]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				SortedArrayIndex++;
			}
		}
		
		public static void main(String[] args) {
			
			int[] arr= {16,51,14,87,56,54,32};
			System.out.println("before selection sort");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.println();
			
			Selection s=new Selection();
			//s.sort(arr);
			s.NewSelectionSort(arr);
			System.out.println("after selection sort");
			for (int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}
		}

	}


