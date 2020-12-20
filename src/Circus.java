
public class Circus {

	public static void main(String[] args) {
		// Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)

		int[][] inputList = {{65, 100}, {70, 150}, {56, 90}, {75, 140}, {60, 95}, {68, 110}};
		int[][] outputList = new int[6][2];
		int towerHeight = 0;
		//System.out.println(inputList.length);
		for (int i=0; i< inputList.length ; i++)
		{
			int largeestHeight = i;
			for (int j=i+1; j<inputList.length; j++)
			{
				if (inputList[largeestHeight][0] < inputList[j][0])
					largeestHeight = j;
			}
			int temp1 = inputList[i][0];
			int temp2 = inputList[i][1];
			
			inputList[i][0] = inputList[largeestHeight][0];
			inputList[i][1] = inputList[largeestHeight][1];
			
			inputList[largeestHeight][0] = temp1;
			inputList[largeestHeight][1] = temp2;
			
			outputList[i][0] = inputList[largeestHeight][0];
			System.out.println(inputList[i][0]);
		}
		
	
		for (int i=0; i< inputList.length -1 ; i++)
		{
			if (inputList[i][1] > inputList[i + 1][1] )
			{
				outputList[i][0] = inputList[i][0];
				outputList[i][1] = inputList[i][1];
				System.out.println(outputList[i][0] + "," + outputList[i][1]);
				towerHeight++;
			}
		}
		
		if (inputList[0][1] > inputList[inputList.length-1][1] )
		{
			outputList[inputList.length-1][0] = inputList[inputList.length-1][0];
			outputList[inputList.length-1][1] = inputList[inputList.length-1][1];
			towerHeight++;
			System.out.println(outputList[inputList.length-1][0] + "," + outputList[inputList.length-1][1]);
		}

		System.out.println("With given set of values, we can have tower of " + towerHeight + " people.");
	}

}
