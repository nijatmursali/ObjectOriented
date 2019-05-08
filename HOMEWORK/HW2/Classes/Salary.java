
public class Salary {
	
	String type;
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	String description;
	private int amount;
	int empID;
	

	public Salary() {
		amount=5000;
		type="high-salary";
		
		empID = 6677;

		description = "This is the salary empoyee gets";
	
	}

	public int addSalary() {
		return amount;
		
	}

	public int editSalary(int newSalary) {
		this.amount = newSalary;
		return amount;
	}

}
