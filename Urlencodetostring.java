
import java.io.*;

public class Urlencodetostring
{
	
	public static void main(String[] args){
	   String x = decodeurlencode("%20%23%27");
		System.out.println(x);
	}
	public static String decodeurlencode(String input){
		try
		{
			String decoded = java.net.URLDecoder.decode(input, "UTF-8");
			return decoded;
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println(e);
		}

		return null;
	}
	
}
