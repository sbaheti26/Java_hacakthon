import java.util.Scanner;

public class Uppertolower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String strupper=sc.next();
		String strlower=strupper.toLowerCase();
		System.out.println("STRING IN LOWERCASE IS "+'\n'+ strlower);
		

	}

}
