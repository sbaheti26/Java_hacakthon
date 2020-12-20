import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		//split string returns an array of string by splitting the given string with reg expression
		
		String s="geeks for geeks is a good for learning website";
		String[] str=s.split("for");
		for (String arr : str) {
			System.out.println(arr);
		}
			System.out.println("****************");
			
			String st="this is my best coding program n best of my best..";
			String[] arr2=st.split("best", 1); 
			String[] arr4=st.split("best", 2); //if we give 2, then two times it will split
			
			for (String arr1 : arr2) {
				System.out.println(arr1);
				
			}
			
			for (String arr5 : arr4) {
				System.out.println(arr5);
				
			}
			
			String whitespace="shraddha     is a     good   girl";
			//System.out.println(whitespace.split("\\s+"));
  String[] arrspace=whitespace.split("\\s+");
  
 //it will split no matter how many whitespace will be there between word
  
  for (String st6 : arrspace) {
	  System.out.println(st6);
	
}
		
	}

}
