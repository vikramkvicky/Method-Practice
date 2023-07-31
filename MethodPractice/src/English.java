

import java.util.Scanner;
public class English {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Enter a number");
		 char Month = scan.next().charAt(0);
		
		switch(Month)
		{
		case 1:System.out.println("One");
		          break;
		case 2:System.out.println("Two");
                  break;
		case 3:System.out.println("Three");
                  break;
		case 4:System.out.println("Four");
                  break;
		case 5:System.out.println("Five");
                 break;
		case 6:System.out.println("Six");
                 break;
		case 7:System.out.println("Eight");
                  break;
		case 8:System.out.println("Nine");
                break;
		case 9:System.out.println("Ten");
                break;
		case 10:System.out.println("Eleven");
                break;
		case 11:System.out.println("Twelve");
               break;
		case 12:System.out.println("Thirteen");
               break;
        default:System.out.println("Fourteen");
		}
	}

}
