import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassStringMain 
{
	public static void main(String[] arg)
	{
		ClassString cs = new ClassString();
		String str=new String("");
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Enter String : ");
			str = ins.readLine();
		} catch (IOException e) 
		{
		}	
		System.out.println("Orginal String :"+ str);
		str = cs.reverseString(str);
		System.out.println("Reverse String :"+ str);
	}
}	
