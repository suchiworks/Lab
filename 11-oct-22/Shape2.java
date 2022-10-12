package oct11Lab;
//super keyword-- reference variable which 
            //refer immediate parent class
//3 usage of super keyword
//3--- refer immediate parent class constructor


class Shape2 {//parent class
	         //constructor of parent class
public Shape2() {System.out.println("Hello");}
}
class Size2 extends Shape2{//child class
	        //constructor of the child class
			Size2(){
	//invoke immediate parent class constructor line no7
				super();
				System.out.println("hi");
			}}
		class Supercons{
			public static  void main(String args[]) {
				Size2 obj=new Size2();
			}
		}
	
