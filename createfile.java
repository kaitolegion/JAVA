import java.io.*;

public class createfile{
	
	public static void main(String[] args){
		
		try{
			FileOutputStream file = new FileOutputStream("/sdcard/AppProjects/Java/src/test.txt");
			DataOutputStream f = new DataOutputStream(file);
			f.writeUTF("Your Text Here");
			f.close();
			System.out.println("File is Created");
		}
		catch(Exception e){
			System.out.println("Failed to create");
		}
	}
	
}
