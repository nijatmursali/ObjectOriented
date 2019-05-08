
public class Employee extends User {
	String empName;
	int empID;
	String uRole;
	String empAddress;
	String empCard;
	String empUsername;
	String empPass;
	int amount;
	Salary salary;

	public Employee() {
		salary = new Salary();
		amount = salary.getAmount();
		this.empAddress = super.uAddress;
		this.uRole = super.uRole;
		this.empName = super.uName;
		this.empID = super.uId;

		// TODO Auto-generated constructor stub
	}

	public void Register() {
		super.addUser();
	}

	@Override
	public void deleteUser() {
		int ind = users.indexOf(empName);
		users.remove(ind);
		System.out.println("Employee: " + uName + " is fired from the job of " + uRole + "\n");

	}

	public void Login() {
		System.out.println("Employee" + empName + " is logged in\n");
	}

	public void Modify(String newUsername) {

		System.out.println("Username" + empUsername + " is modified to" + newUsername + "\n");
		empUsername = newUsername;
	}

	public void checkProgress() {
		System.out.println("Employee" + empName + " chkecked progress\n");
	}

	public int getRewards() {

		System.out.println("Employee " + empName + " got salary of " + amount + "\n");
		return amount;
	}
};