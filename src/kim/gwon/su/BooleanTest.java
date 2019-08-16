package kim.gwon.su;

import javax.swing.JOptionPane;

public class BooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String winner;
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("자연수1"));

		int num2;
		num2 = Integer.parseInt(JOptionPane.showInputDialog("자연수2"));

		if( num1 > num2 ) {
			winner = "number1";
			System.out.println("승자는" + winner + "입니다.");
		}else if( num1 < num2 ) {
			winner = "number2";
			System.out.println("승자는" + winner + "입니다.");
			
		}else if( num1 == num2) {
			System.out.println("이승부는비겼습니다.");	
		}
}}
