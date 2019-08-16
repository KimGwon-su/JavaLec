package kim.gwon.su;

import java.util.Scanner;

public class Kgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rnjstn = new Scanner(System.in);
		String password = rnjstn.nextLine();
		
		if(password.length() >= 8 && password.length() <= 15) {
		System.out.println(password+"¾Ó±â¸ð¶ì");
		}
		
		

	}

}
