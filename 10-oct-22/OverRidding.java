package oct10;

class TestOverRidding {
void run() {
	System.out.println("running mode on");
}}
//creating child class
class OverRidding extends TestOverRidding{
	//defining same name method that declared in the parent class
	void run() {//method 2
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		// creating a object of child class
 OverRidding a=new OverRidding();
a.run();
	}

}
