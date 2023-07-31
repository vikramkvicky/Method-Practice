import java.util.*;
public class Prg77 {

	public static void main(String[] args) {
		//Creating the object of scanner class
		Scanner scan = new Scanner(System.in);
		//Asking user to enter a character
		System.out.println("Enter a character");
		//Storing the character in variable ch
		char ch = scan.next().charAt(0);
		//Checking whether the character is uppercase
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UpperCase Letter");
		}
		//Checking whether the character is lowercase
		else if (ch>= 'a' && ch<='z')
		{
			System.out.println("LowerCase  Letter");
		}
		//Checking whether the character is number
		else if (ch>= '0' && ch<= '9') 
		{
			System.out.println("It is Number");
		}
		//Checking whether the character is special caharacter
		else 
		{
			System.out.println("Special Character");
		}
		
	}
	

}
