package lab17oct;
//we can take no.of arguments

public class VaragrsEg {
static void show(String[] text) {//using varargs
	System.out.println("show method invoked");
	for(String S:text) {//for each loop
		System.out.println(S);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Show ();    //Zero args
   Show("hi"); //one
    Show("I","love","coding"); //three
	}

}
