package kim.gwon.su;

import javax.swing.JOptionPane;

public class BooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String winner;
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("�ڿ���1"));

		int num2;
		num2 = Integer.parseInt(JOptionPane.showInputDialog("�ڿ���2"));

		if( num1 > num2 ) {
			winner = "number1";
			System.out.println("���ڴ�" + winner + "�Դϴ�.");
		}else if( num1 < num2 ) {
			winner = "number2";
			System.out.println("���ڴ�" + winner + "�Դϴ�.");
			
		}else if( num1 == num2) {
			System.out.println("�̽ºδº����ϴ�.");	
		}
}}
