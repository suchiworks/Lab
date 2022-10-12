package oct11Lab;

//final keyword---
//final method-- cannot override the final method
//final class,final variable

public class Finalmethod {
	                       //create a final method
	public final void display() {
			System.out.println("this is final method");
			
	}
/*class Main extends Finalmethod{
 *try to override final method
 *public final void display(){
 *system.out.println("the final method is override");}
	*/
	public static void main(String[] args) {
      Finalmethod obj=new Finalmethod();
      obj.display();
	}

}
