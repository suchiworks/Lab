package lab18oct;

interface Multiple_in1 {
	void show();
	}
	interface Multiple_in2{
		void  display();
    }
	class Multiplein implements Multiple_in1 ,Multiple_in2 {
		public void show() {
			System.out.println("hii");}
		public void display(){
		    System.out.println("hellow");
    }
		public void main(String[] args) {
			Multiplein obj=new Multiplein();
			obj.show();
			obj.display();
	}}	
	
	
	
	


