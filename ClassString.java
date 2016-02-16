import java.lang.String;

public class ClassString {
    String str=new String("");
	String reverseString(String fstr)
	{
		for (int i=fstr.length();i>0;i--)
		{
			str+=fstr.substring(i-1,i);
		}
		return str;
	}
}