
public class Repeatedin {

	public static void main(String[] args) {
		String str="shraddHA123";
		int num=0;
		int strupper=0;
		int strlower=0;
		System.out.println("given string is "+str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				strupper++;
			
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
				strlower++;
			
			else if (Integer.parseInt(String.valueOf((str.charAt(i))))>=0 && Integer.parseInt(String.valueOf((str.charAt(i))))<=9)
				num++;						
		}
		System.out.println("number of integers:"+num);
		System.out.println("number of uppercaSE:"+strupper);
		System.out.println("number of LOWERCASE:"+strlower);
	}
}
