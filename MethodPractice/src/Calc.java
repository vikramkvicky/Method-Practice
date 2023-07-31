import java.util.*;
public class Calc {

	public static void main(String[] args) {
		//creating the object of the scanner class
		Scanner scan = new Scanner(System.in);
		//Asking to user enter a number
		System.out.println("Enter a firt number");
		double num1=scan.nextDouble();
		//Asking to user enter a number
		System.out.println("Enter a second number");
		double num2=scan.nextDouble();
		//Asking to user enter a character
		System.out.println("Enter a Character");
		char operation =scan.next().charAt(0);
		
		if(operation == '+')
		{
			System.out.println(num1 + num2);
		}
		else if(operation == '-')
		{
			System.out.println(num1 - num2);
		}
		else if(operation == '*')
		{
			System.out.println(num1 * num2);
		}	
		else if(operation == '/')
		{
			System.out.println(num1 - num2);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	

}
