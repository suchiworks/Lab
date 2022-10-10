package oct10;

public class OverloadingTypePromotion {
void add(int a,long b) {//method 1
	System.out.println(a+b);}
		void add(int a,int b,int c){
			System.out.println(a+b+c);}
	
	
	public static void main(String[] args) {
		OverloadingTypePromotion obj=new OverloadingTypePromotion ();
		obj.add(2, 3);//2nd int will be promotion to long
		obj.add(10,20,30);
	}

}
