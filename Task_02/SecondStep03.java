import java.util.Scanner;

public class SecondStep03 {
	public static void main(String[] args) {
		
		//Creating object from class Scanner
		Scanner user_input = new Scanner( System.in );
	
		String smth;
		System.out.print("Enter something: ");
		smth = user_input.next();

		int counter =0;
		for(int i=0;i<smth.length();i++) {
		   char c = smth.charAt(i);
		   if (c == '1') {
			   counter++;
		   }
		}
		System.out.println("There are: " + "'" + counter + "'" + " one's in " + smth +".");
	}
}
