
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		 String Name = scan.nextLine();
		
		switch(Name)
		{
		case "Ajay":System.out.println(Name +" lives in Delhi");
		          break;
		case "Ankith":System.out.println(Name +"lives in Bangalore ");
                  break;
		case "Arjun":System.out.println(Name +"lives in pune");
                  break;
		case "Ahas":System.out.println(Name +"lives in Hydrabad");
                  break;
		
        default:System.out.println(Name +"India");
		}
	}

}
