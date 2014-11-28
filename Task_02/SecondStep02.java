import java.util.Scanner;

public class SecondStep02 {
	public static void main(String[] args) {
		
		//Creating object from class Scanner
		Scanner user_input = new Scanner( System.in );
	
		String first_num;
		System.out.print("Enter the first number: ");
		first_num = user_input.next();
		
		String last_num;
		System.out.print("Enter the last number: ");
		last_num = user_input.next();
		
		int x = Integer.parseInt(first_num);
		int y = Integer.parseInt(last_num);
		System.out.println("The numbers between " + first_num + " and " + last_num + " are" + ":");
		for ( x++; x < y; x++ ) {
			 System.out.print(x + ";");
		}
	}
}
