package lab20oct;

public class Read_WriteOblyEn {
//private String name="Alien";//private data member
	private String name;
	public void setName(String name) {
		
this.name=name;
//public String getname(){
//return name;
	}
	public static void main(String[] args) {
		//obj.set_name("penguin");//we cannot change the value of the name
//System.out.println(" name "+obj.getName());
		Read_WriteOblyEn obj=new Read_WriteOblyEn();
		System.out.println(obj.name);
	}
}
