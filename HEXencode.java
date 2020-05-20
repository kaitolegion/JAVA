
import java.nio.charset.*;

public class HEXencode
{
	public static void main(String[] args){

    // Usage 
	   System.out.println(toHex("kaito"));
		
	// Usage: String to Hex
		byte[] bytes = "kaitolegion".getBytes();
        System.out.println(encodeHex(bytes));
	
	// Usage: Hex to String
	    String b = "6b6169746f6c6567696f6e";
		byte[] byt = decodeHex(b);
		String st = new String(byt, StandardCharsets.UTF_8);
		System.out.println(st);
		
	}

	
	// Hex to String
	public static byte[] decodeHex(String hex) {
		int l = hex.length();
		byte[] data = new byte[l/2];
		for (int i = 0; i < l; i += 2) {
			data[i/2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
				+ Character.digit(hex.charAt(i+1), 16));
		}
		return data;
	
	}
	
	// String To Hex
	
	public static String encodeHex( byte [] raw ) {
		if (raw.equals("")) {
			return null;
		}
		final StringBuilder hex = new StringBuilder( 2 * raw.length );
		for ( final byte b : raw ) {
			hex.append("0123456789abcdef".charAt((b & 0xF0) >> 4)).append("0123456789abcdef".charAt((b & 0x0F)));
		}
		return hex.toString();
	}
	
	
	// String to hex
	
	public static final String toHex(String str){
		byte[] a = str.getBytes();
		String b = HEXencode.encodeHex(a);
		return new String(b);
	}
	
}
