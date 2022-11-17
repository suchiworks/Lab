package lab17Nov;
import java.lang.Exception;
public class ThrowException {
		static int anyFunction (int x, int y ){
			try {
				int a = x*y;
				return a;}
			catch (ArithmeticException r) {
				System.out.println ( "number is negative" );}
			return 0;}
		public static void main (String args[]) {
			int x,y, result;
			x=-20;
			y=20;
			try{
				if(x<0||y<0) {
				x = Integer.parseInt(args[0]);
				y = Integer.parseInt(args[1]);
				System.out.print("Value of x and y ="+x+"  "+y);
				}}catch(Exception r) {
			result  = anyFunction (x, y); 
			System.out.println ( "Result: "+ result);
		}
	}
}