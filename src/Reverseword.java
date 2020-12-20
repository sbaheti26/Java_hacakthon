
public class Reverseword {

	public static void main(String[] args) {
		String str="java code";
		String[] arr=str.split("\\s");
		String rev="";
		
		for(int j=0;j<arr.length;j++)
		{
			String word=arr[j];
			String revword="";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			revword=revword+word.charAt(i);
		}
		rev=rev+revword+" ";
		
	}
		System.out.println("reverse words in staring is: "+ rev);

}
}
