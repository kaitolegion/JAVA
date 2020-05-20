import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class sha1encode{
	
	public static void main(String[] args){
	
	  
		hash("jsjsjsjs");
	}
	
	public static void hash(String input){
		try {
			MessageDigest hash = MessageDigest.getInstance("SHA-1");
		    hash.update(input.getBytes());
			byte[] digest = hash.digest();
			StringBuffer hexString = new StringBuffer();
			for(int i = 0; i < digest.length; i++){
				hexString.append(Integer.toHexString(0xFF & digest[i]));
			}
			String encode = hexString.toString();
			System.out.println(encode);
	    }
		catch (NoSuchAlgorithmException e)
		{
			
		}
	}
	
}
