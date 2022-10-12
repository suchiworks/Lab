package oct11Lab;
/*super keyword-- reference variable with  refer 
                       immediate parent class*/
//3 usage of super keyword
//no2 for parent class method

class Shape1 {//parent class
void print() {//data member of parent class
	System.out.println("print circle");
}}
class Size1 extends Shape1{//child class
	void print() {       //child class method
		System.out.println("print traingle");}
	void display() {//new method of child class
		System.out.println("print nothing");}
	void show() {//final method
		super.print();
		display();
		print();
	}}
class SuperMethod{
	public static void main(String args[]) {
		Size1 obj=new Size1();
		obj.show();
		
	}
}