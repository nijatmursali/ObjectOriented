
public class Ssystem {
	Employee user;
	int uId;
	String uRole;
	String uName;
	String uEmail;
	String uAddress;
	String vacancyName;
	String vacancyDescrpt;
	String reports;

	public Ssystem() {
		this.user = new Employee();
		this.uAddress = user.uAddress;
		this.uId = user.uId;
		this.uEmail = user.uEmail;
		this.uRole = user.uRole;
		this.uName = user.uName;

	}

	public void giveSalary() {
		user.getRewards();
	}

	public void addVacancy(String vacancyName, String vacancyDescrpt) {
		this.vacancyName = vacancyName;
		this.vacancyDescrpt = vacancyDescrpt;
		System.out.println("Vacant place for the job of" + this.vacancyName + this.vacancyDescrpt + "\n");
	}

	public void giveReports(String reports) {
		this.reports = reports;
	}

	public void checkTasks() {
		for (int i = 0; i < user.users.size(); i++)
			System.out.println("Tasks of" + user.users.get(i) + "are checken\n");
	}

	public void addUser() {
		user.addUser();
	}

	public void editUser() {
		user.editUser();

	}

	public void deleteUser() {
		user.deleteUser();

	}

}
