package oct11Lab;

//final keyword---
//final class-- cannot extend the final class
final class Finalclass {
class test extends Finalclass{  //can't extends final class
	void show() {System.out.println("nothing");
	}
	public void main(String[] args) {
test t=new test();
t.show();
	}}}