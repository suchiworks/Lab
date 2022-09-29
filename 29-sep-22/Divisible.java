package labRec29;
/*Write a Java program to print numbers between 1 to 100
 *  which are divisible by 3, 5 and by both*/
public class  Divisible{
	
    	public static void main(String args[]) {
		System.out.println("\nDivisible by 3  ");		
		for (int i=1; i<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n Divisible by 5  ");
		for (int i=1; i<100; i++) {
			if (i%5==0) 
			System.out.print(i +", ");			
		}
				
		System.out.println("\n Divisible by both  ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) 
		 System.out.print(i +", ");			
		}
		   System.out.print("  ");
  }
}

