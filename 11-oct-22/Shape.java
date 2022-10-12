package oct11Lab;

class Shape {//parent class
String name="circle";//data member of parents class
}
class Size extends Shape{
	String name="Triangle";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}}
class SuperIV{
	public static void main(String args[]) {
		Size obj=new Size();
		obj.print();
	}
}
