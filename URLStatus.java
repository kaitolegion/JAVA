
import java.net.*;
import java.io.*;

public class URLStatus
{
	
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://facebook.com");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		int statusCode = http.getResponseCode();
		System.out.println(statusCode);
	
		
	}
	
}
