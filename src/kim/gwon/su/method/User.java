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
		System.out.println("로그인했습니다.");
		return true;
	}
	
	public boolean signOut(User user) {
		System.out.println("로그아웃했습니다.");
		return true;
	}
	
	public int signUp(User user) {
		System.out.println("회원가입 했습니다.");
		return 1;
		
	}
	
	public int edit(User user) {
		System.out.println(user.username+ "님의 정보 변경 했습니다.");
		return 1;
	}
	
	

}
