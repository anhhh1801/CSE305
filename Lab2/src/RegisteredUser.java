import java.util.*;

public class RegisteredUser {
	List<User> listUser = new ArrayList<>();

	public RegisteredUser(List<User> listUser) {
		super();
		this.listUser = listUser;
	}
	
	public void addUser (User u) {
		listUser.add(u);
	}
	
	public void removeUser (User u) {
		listUser.remove(u);
	}
}
