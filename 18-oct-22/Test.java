package lab18oct;

interface Demo1{
	void show();
}

 class Test implements Demo1{
	 public void show(){//method
		 System.out.println("hello my future employees");
 }
	 class Demo implements Demo1{
		 public void show(){//method
			 System.out.println("welcome to the company");
	 }}
public static void main(String [] args) {
	Test obj = new Test();
	obj.show();//calling method
}
}
