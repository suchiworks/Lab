package oct11Lab;

public class Aa {  //parent class/base class
 Aa(){
	  System.out.println("nothing");
}}
class Bb extends Aa{  //child/derived/extend
 Bb(){
	System.out.println("Anything");
 }}
class Inheritance{
	public static void main(String []args) {
		Bb obj=new Bb();  //obj of child class
	}
}
