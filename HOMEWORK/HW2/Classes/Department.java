import java.util.ArrayList;

public class Department {
	ArrayList<String> departments;
	int depID;
	String depType;
	String depName;
	int empID;
	Employee emp;

	public Department(String depName, String depType) {
		departments = new ArrayList<String>();
		emp = new Employee();
		this.empID = emp.empID;
		this.depType = depType;
		this.depName = depName;

	}

	public void addEmployee() {
		emp.Register();

	}

	public void addDepartment() {

		departments.add(depName);
		this.depID = departments.indexOf(depName);
		System.out.println("Department: " + depName + " is added to the System\n");

	}

	public void editDepartment() {
		System.out.println("Department" + depName + "is edited\n");

	}
	

	public void searchDepartment(int depID) {
		System.out.println("Given ID attached to the department of " + departments.get(depID)+"\n");

	}

}
