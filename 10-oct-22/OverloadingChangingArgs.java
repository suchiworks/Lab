package oct10;
//method overloading-same name different arguments
// two way we overload the method
//1 changing no. of arguments
public class OverloadingChangingArgs {
      static int sum(int a,int b) {//two parameters/arguments
    	  return a+b;}
      static int sum(int a,int b, int c) {//three arguments
    	  return a+b+c;
      }
	
	public static void main(String[] args) {
 System.out.println( OverloadingChangingArgs.sum(5, 6));
 System.out.println( OverloadingChangingArgs.sum(5, 6, 7));
	}

}
