import java.util.*;
public class Program {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan = new Scanner(System.in);
		//Asking user to enter a number
		System.out.println("Enter a number:");
		// storing the number in variable num
		int num = scan.nextInt();
		//Checking whether a number is in the range from 1 to 10
		if (num >=1 && num <=10)
		{
			System.out.println("Range 1");
			
		}
		//Checking whether a number is in the range from 11 to 20
		else if(num >=11 && num <=20)
		{
			System.out.println("Range 2");
	    }
		//Checking whether a number is in the range from 21 to 30
		else if(num >=21 && num <=30)
		{
			System.out.println("Range 3");
		}
		//Checking whether a number is in the range from 31 to 40
		else if(num >=31 && num <=40)
		{
			System.out.println("Range 4");
	
		}
		//Checking whether a number is in the range from 41 to 50
		else if (num >=41 && num <=50)
		{
			System.out.println("Range 5");
		}
		
		else
			// if the number is not in the range ,printing inside range
		{
			System.out.println("*************Inside Range*************");
		}
}
	
	
}