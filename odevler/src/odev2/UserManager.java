package odev2;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFullName()+ ": giri� yapt�.");
	};
	
	public void logout(User user) {
		System.out.println(user.getFullName()+ ": ��k�� yapt�.");
	};
}
