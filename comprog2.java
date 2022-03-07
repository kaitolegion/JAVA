// PROGRAM BY KAITO <3
// MARCH 07, 2022

import java.util.Scanner;
import java.time.LocalDate; 
import java.time.Period;

class A5 extends Exception {
}
class A4 extends Exception {
}
class A3 extends Exception {
}
class A2 extends Exception {
}
class A1 extends Exception {
}
public class Main
{
	public static void main(String[] args) {

	    Scanner Obj = new Scanner(System.in);

	    // Read User fullname 
		System.out.println("Enter fullname:");
		String fullname = Obj.nextLine();
		
		 // Read User birthday
		System.out.println("Birthday:");
		String bd = Obj.nextLine();
	    
	    // separate split value in birthday using array
	    
	    String[] split = bd.split("/");
	    int month = Integer.parseInt(split[0]);
	    int day = Integer.parseInt(split[1]);
	    int year = Integer.parseInt(split[2]);
	    
	    // Calculate age from birthday
	   
	    LocalDate l = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();
        Period kaito = Period.between(l, now);
      
	    // Category using else if statement
	    
	    try{
	         if(kaito.getYears() >= 0 && kaito.getYears() <= 6){
	             throw new A5();
	         }  else if (kaito.getYears() >= 7 && kaito.getYears() <= 11){
	             throw new A4();
	         }  else if (kaito.getYears() >= 12 && kaito.getYears() <= 24){
	             throw new A3();
	         }  else if (kaito.getYears() >= 25 && kaito.getYears() <= 60){
	             throw new A2();
	         }  else if (kaito.getYears() >= 60){
	             throw new A1();
	         }  else {
	             throw new Exception();
	         }
	        
	    } catch(A5 e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category A5.");
	    } catch(A4 e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category A4.");
	    } catch(A3 e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category A3.");
	    } catch(A2 e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category A2.");
	    } catch(A1 e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category A1.");
	    } 
	    catch(Exception e){
	        System.out.println("\nHi "+fullname+".\nYour age is "+kaito.getYears()+".\nYour part of the Category Invalid.");
	    
	    }
	    
	}
}
