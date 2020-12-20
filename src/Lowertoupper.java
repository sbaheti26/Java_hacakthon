import java.util.Scanner;

public class Lowertoupper {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String strlower=sc.next();
		String strupper=strlower.toUpperCase();
		System.out.println("STRING IN UPPERCASE IS "+'\n'+ strupper);

	}

}
