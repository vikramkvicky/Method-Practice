import java.util.Scanner;

public class Quatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int quotient = number;
        
        while (quotient > 1) {
            quotient /= 2;
            System.out.println(quotient);
        }
        
        
    }
}
