import java.util.regex.*;
import java.security.acl.*;

public class RegexMatcher{
	
	public static void main(String[] args){
		
		Pattern pattern = Pattern.compile("^(http|https|ftp)://.*$");
		
		Matcher matcher = pattern.matcher("http://google.com");
		
		while (matcher.find()){
			System.out.print("Length number : "+matcher.start()+"\n");
			System.out.println("Found -> "+matcher.group());
		}
		
	}
	
}
