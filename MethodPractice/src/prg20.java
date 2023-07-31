
import java.util.*;

public class prg20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       

        int num;
        do {
            System.out.print("Enter a number greater than 100: ");
            num = scan.nextInt();
        } while (num <= 100);

        System.out.println("Even numbers from 1 to " + num + " are");
        for (int i = 1; i <= num; i++) {
           if (i % 2 == 0) {
               System.out.print(i+" ");
        
           
           }
       }
        
       

    {
    	System.out.println("Divisible by 3 is " +num+"");
    	for (int i = 1; i <= num; i++) {
    		if(i%3==0) {
    			System.out.println(i+" ");
    		}
    		
    	}
    
    	System.out.println("Divisible by 5 is" +num+"");
    	for (int i=1;i<=num;i++)
    	{
    		if(i%5==0) {
    			System.out.println(i+" ");
    		}
    	}
    	System.out.println("Even numbers Are:" +num+"");
    	for (int i=2;i<=num;i++)
    	{
    		if(i%2==0 ) {
    			System.out.println(i+" ");
    }
    }
    	System.out.println("Divisible by 2 and 5:" +num+"");
    	for (int i=1;i<=num;i++)
    	{
    		if(i%2==0 && i%5==0) {
    			System.out.println(i+" ");	
}
    }
    	System.out.println("Divisible by 3 and 5:" +num+"");
    	for (int i=1;i<=num;i++)
    	{
    		if(i%3==0 && i%5==0) {
    			System.out.println(i+" ");	
}
}
    	System.out.println("prime numbers:" +num+"");
    	for (int i=1;i<=num;i++)
    	{
    		if(i%2==0 && i%5==0) {
    			System.out.println(i+" ");	
}
    }
    	System.out.println("Divisible by 2 and 5:" +num+"");
    	for (int i=1;i<=num;i++)
    	{ int count=0;
    	for(int j=2;j<=i;j++) {
    	}
    		if(i%j==0) { count++;
    		}
    	}
    	
    			System.out.println(i+" ");	
}
    }
}
    }
}

