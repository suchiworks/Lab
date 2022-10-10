package oct10;
//method overloading-same name different arguments
//two way we overload the method
//1 changing no. of arguments
//2 changing data types of arguments
public class OverloadingChangingArgs2 {
   static int sum(int a,int b) {//two parameters/arguments
 	  return a+b;}
   static double sum(double a,double b, double c) {//three arguments
 	  return a+b+c;
   }
	
	public static void main(String[] args) {
System.out.println( OverloadingChangingArgs2.sum(5, 6));
System.out.println( OverloadingChangingArgs2.sum(5.1, 6.2, 7.3));
	}

}


	

	