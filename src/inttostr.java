import java.util.Scanner;

public class inttostr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any int num");
		int ans=sc.nextInt();
		System.out.println("Enter any int num");
		int num=sc.nextInt();
		String s=Integer.toString(ans);
		System.out.println(s);
		String strs=String.valueOf(num);
	
		System.out.println(strs);
	}

}
