
public class Reverse {

	public static void main(String[] args) {
		// 
		String str="Java Code";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is: "+ rev);
		

	}

}
