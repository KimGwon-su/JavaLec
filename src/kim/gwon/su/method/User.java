package kim.gwon.su.method;

public class User {
	int id;
	String login;
	String password;
	String phone;
	String email;
	String address;
	String username;
	
	boolean signIn(User user) {
		System.out.println("�α����߽��ϴ�.");
		return true;
	}
	
	public boolean signOut(User user) {
		System.out.println("�α׾ƿ��߽��ϴ�.");
		return true;
	}
	
	public int signUp(User user) {
		System.out.println("ȸ������ �߽��ϴ�.");
		return 1;
		
	}
	
	public int edit(User user) {
		System.out.println(user.username+ "���� ���� ���� �߽��ϴ�.");
		return 1;
	}
	
	

}
