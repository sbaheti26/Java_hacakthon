import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fileread {

	public static void main(String[] args) throws Exception {
		String spath=System.getProperty("user.dir")+"/read.txt";
		readfile(spath);

	}
	
	public static void readfile(String spath) throws Exception
	{
String sline;
		
		//read a line and adding that line to sline
		//if string is null, then we have to get out of loop
		FileReader ofr=new FileReader(spath);//it will load the file to file reader
//if there is no file , it will thrown exception
		BufferedReader oBR=new BufferedReader(ofr);//it will read the file
		//oBR.readLine();
		//oBR.readLine();
		while((sline=oBR.readLine())!=null)
		{
			System.out.println(sline);
		}
	}
	
	
}
