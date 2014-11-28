import java.util.Scanner;

public class SecondStep01 {
	public static void main(String[] args) {
		
		//Creating object from class Scanner
		Scanner user_input = new Scanner( System.in );
	
		String first_name ;
		System.out.print("Enter your first name: ");
		first_name = user_input.next();
		
		String last_name;
		System.out.print("Enter your last name: ");
		last_name = user_input.next();
		
		String full_name;
		full_name = first_name + " " + last_name;
		System.out.print("Hello, " + full_name + "!");
		
	}
}
