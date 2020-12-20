
public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public static double cal(int x,int y,String z)
	{
		double result=0;
		switch(z)
		{
		case "a":
			result=x+y;
			break;
		case "s":
			result=x-y;
			break;
		case "m":
			result=x*y;
			break;
		case "d":
			result=x/y;
			break;
			
		}
		return result;
	}
}
		
			
		
	


