package lab17Nov;

public class Addinterger {
int addTwoPositive(int a,int b) {
	if(a<0||b<0) {
		throw new ArithmeticException("non positive integer");
	}}
	catch(ArithmeticException r) {
		System.out.println(r.getMessage());
		return 0;
	}
	finally{
		System.out.println("execute");}
	return(a+b);
	}
public static void main(String[]args) {
	Addinterger obj=new Addinterger();
	System.out.println("sum"+obj.addTwoPositive(-10,20));}

}
