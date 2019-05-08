public class Database {
	private int empID;
	private String empName;
	private int empSalary;
	Employee emp;

	public Database() {
		this.emp = new Employee();
		this.empID = emp.empID;
		this.empName = emp.empName;
		empSalary = emp.getRewards();
	}

	public void checkEmp(int empID) {
		System.out.println("Given ID attached to the employee of " + emp.users.get(empID));
	}

	public int checkDetails(String empName) {
		return emp.users.indexOf(empName);
	}

	public void modifyChanges() {
		System.out.println("Changes are modified\n");
	}

	public void editEmp() {
		emp.Modify(empName);
	}

	public void searchEmp(String empName) {
		System.out.println("Employee found in our DB with details of " + emp.empAddress + emp.uEmail + emp.uRole +"\n");
	}

	public void assignTask(String newTask) {
		System.out.println("Empoyee " + empName + "is assigned with the task of " + newTask+"\n");
	}

	public void idetifyPriv() {
		System.out.println("Privilages are identifing...\n");
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
