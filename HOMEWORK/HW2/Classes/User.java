import java.util.ArrayList;

public class User {
	ArrayList<String> users;
	int uId;
	String uRole;
	String uName;
	String uEmail;
	String uAddress;

	public User() {
		users = new ArrayList<String>();
		this.uName = "Aytan";
		this.uAddress = "Baku, Azerbaijan";
		this.uEmail = "ababayeva2019@gmail.com";
		this.uRole = "Software Engineer";
		this.uId = 5566;
	}

	public void addUser() {

		users.add(uName);
		System.out.println("User: " + uName + " is added to the System\n");

	}

	public void editUser() {
		System.out.println("User" + uName + "is edited\n");

	}

	public void deleteUser() {
		int ind = users.indexOf(uName);
		users.remove(ind);
		System.out.println("User: " + uName + " is deleted from the System\n");

	}

}
