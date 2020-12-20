
public class Subsesequence {

	public static void main(String[] args) {
		// subsequence is a builtin string function that returns a char sequence.
		//CharSequence that is a subsequence of this sequence. 
		//The subsequence starts with the char value at the specified index and ends with the char value at(end-1)
		
		String s="java is a programming language";
	System.out.println( s.subSequence(4, 9));
	CharSequence ch=s.subSequence(0, 12);
	System.out.println(ch);
	
		

	}

}
