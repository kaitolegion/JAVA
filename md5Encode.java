
import java.security.*;
import java.math.*;public class md5Encode
{
	
	public static void main(String[] args){
	   String encode = getMd5Hash("Jsbdjdjds");
	   System.out.println(encode);
	}
	
	public static String getMd5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String md5 = number.toString(16);

            while (md5.length() < 32)
                md5 = "0" + md5;

            return md5;
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
            return null;
        }
    }
	
}
