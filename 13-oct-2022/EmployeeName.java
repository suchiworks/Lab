package prac13thOct;

public class EmployeeName {
	static String empName;
	  static int empId;
		static void  empDetails(String name,int id) {
			empName=name;
			empId=id;
			System.out.println(empName+" "+empId);
		}
	}
	 class EmployeeClass extends EmployeeName{
		 public static void main(String[] args) {
			 EmployeeName.empDetails("suchi", 100); //obj 1
			 EmployeeName.empDetails("gudu", 101); //obj 2
			 EmployeeName.empDetails("gita", 102); //obj 3
			 EmployeeName.empDetails("golu", 103); //obj 4
			 EmployeeName.empDetails("sid", 104); //obj 5
			 
			
		}
	 }

