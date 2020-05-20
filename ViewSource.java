
import java.net.*;
import java.util.regex.*;
import java.io.*;

public class ViewSource {
	
	public static void main(String[] args) {
		viewsource("http//silverlake.sg/admin/login.php");
	}

	
	public static void viewsource(String input){
		try{
		URL url = new URL(input);
		URLConnection con = url.openConnection();
		Pattern p = Pattern.compile("text/html;\\s+charset=([^\\s]+)\\s*");
		Matcher m = p.matcher(con.getContentType());
		String charset = m.matches() ? m.group(1) : "ISO-8859-1";
		Reader r = new InputStreamReader(con.getInputStream(), charset);
		StringBuilder buf = new StringBuilder();
		while (true) {
			int ch = r.read();
			if (ch < 0)
				break;
			buf.append((char) ch);
		}
		String str = buf.toString();
		System.out.println(str);
		}
		catch (IOException e)
		{
		   System.out.println("Please Enter Valid URL\n"+e);
		}
	}
	
	
}
