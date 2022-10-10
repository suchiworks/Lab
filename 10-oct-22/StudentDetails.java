package oct10;

public class StudentDetails {
int id;
String name;
StudentAddress address;//ref entity

public StudentDetails(int id,String name,StudentAddress address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.dist);
	
}

	public static void main(String[] args) {
		StudentAddress a1=new StudentAddress("newton","kolkata","north 24");
	    StudentDetails d1=new StudentDetails(1,"pallabi", a1);
	    

	}

}
