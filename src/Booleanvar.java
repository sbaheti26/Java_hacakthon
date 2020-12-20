

public class Booleanvar {

	public static void main(String[] args) {
		/*boolean results = check(true,true,true);
		System.out.println(results);*/

		boolean results1 = check1(true,false,false);
		System.out.println(results1);
		
		

	}
	
	
		
	public static boolean check1(boolean vara,boolean varb, boolean varc)
	{
		int total = 0;
		
		if (vara)
			total++;
		if (varb)
			total++;
		if (varc)
			total++;
		
		if(total >= 2)
		{
			return true;
		}
		else
			return false;
		
		
	}





public static boolean check(boolean vara,boolean varb, boolean varc)
{
	if((vara && varb)||(varc && varb)||(vara && varc))
	{
		return true;
	}
	else
		return false;
}
}
