
public class User {
	int UserID;
	String password;
	String email;
	String UserType;
	
	
	public User() {
		super();
	}

	public User(int userID, String password, String email, String userType) {
		super();
		UserID = userID;
		this.password = password;
		this.email = email;
		UserType = userType;
	}
	
	public void ResetPassword(String newPassword) {
		this.password = newPassword;
	}
}
